package shukupon.designpatterns.builder;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * 実行クラス.実行時に「Yamahaimoto」もしくは「MurokaNamaGenshu」を引数として渡す。
 * 
 * @author Shukupon
 *
 */
public class Main {

	public static void main(String[] args) {

		// クラスファイル情報の取得
		if (args.length < 1 || !(args[0].equals("Yamahaimoto") || args[0].equals("MurokaNamaGenshu"))) {
			System.out.println("「Yamahaimoto」もしくは「MurokaNamaGenshu」を引数として渡してください。");
			return;
		}
		String targetBuilderName = args[0];
		String classPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		File root = new File(classPath);
		List<File> list = getClassList(root);
		
		// 対象のConcreteBuilderのクラスを探す
		Class targetClass = null;
		for (File file : list) {
			if (file.getAbsolutePath().contains(targetBuilderName)) {
				String fileName = file.getAbsolutePath()
						.replace(root.getAbsolutePath(), "")
						.substring(1)
						.replace("\\", ".")
						.replace(".class", "");
				try {
					targetClass = Class.forName(fileName);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		}

		if (targetClass == null) {
			System.out.println("「Yamahaimoto」もしくは「MurokaNamaGenshu」を引数として渡してください。");
			return;
		} else if (SakeBuilder.class.isAssignableFrom(targetClass)) {
			SakeBuilder targetBuilder = null;
			try {
				targetBuilder = (SakeBuilder) targetClass.getConstructor().newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
			Brewer brewer = new Brewer(targetBuilder);

			brewer.brew();
		}

	}

	private static List<File> getClassList(File targetDir) {
		List<File> list = new ArrayList<File>();
		File[] files = targetDir.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				list.addAll(getClassList(file));
				continue;
			}
			if (file.getName().endsWith(".class")) {
				list.add(file);
			}
		}
		return list;
	}
}
