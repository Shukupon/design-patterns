package shukupon.designpatterns.proxy;
/**
 * FlyWeightにあたるクラス.
 * @author Shukupon
 *
 */
public class Liquor implements Drink {
    
    private String name;
    private String view;
    
    public Liquor(String name) {
        this.name = name;
        System.out.println("お酒を生成中");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        switch (name) {
        case "ビール":
            view = "         ＿＿\r\n"
                    + "　 　 　　 { ::三}\r\n"
                    + "　　　　　..|　 =|\r\n"
                    + "　　　　　　 |　 :=|\r\n"
                    + "　 　　　　 |　 ::=|\r\n"
                    + "　　　　 . i 　　:=|\r\n"
                    + "　　　　 　i    :::i.\r\n"
                    + "　 　 　　.,'    .::',\r\n"
                    + "　　 　　/.;;;;;. ::',\r\n"
                    + "　　　 ./ ;;;;; .::',\r\n"
                    + "　 　 ./      ..:;',\r\n"
                    + "　　　|::＿＿＿＿＿_=|\r\n"
                    + "　　　|r―――――-―――――― |\r\n"
                    + "　　　|::..＿＿＿ ::|\r\n"
                    + "　　　|::  （beer）　　:|\r\n"
                    + "　　　|:　　￣￣￣　:::|\r\n"
                    + "　　　|: 　 ヒ゛ール 　 :|\r\n"
                    + "　　　|＿＿＿＿＿＿＿:|\r\n"
                    + "　　　|ー――――――――――――!\r\n"
                    + "　　　lL＿＿＿＿＿＿=」";
            break;
        case "日本酒":
            view = "                                                                                             ....---.---....\r\n"
                    + "                                                                                         (dMM0wwZWMMMMHkwwXMMNx\r\n"
                    + "                                                                                        .KXWHgmkfyyyVfbmHqHpfVW{\r\n"
                    + "                                                                                        .WXXWHY404VkkkKHWWWWkXW}\r\n"
                    + "                                                                                         (zWOW0ZHAQdM@HHHHHNN1:\r\n"
                    + "                                                                                        `.dWHHWWWWWHHHWWWWWHMm+\r\n"
                    + "                                                                                         jWHHXvvZWM##MHurrXWHMI\r\n"
                    + "                                                                                         jW@HXvvXWM#HMWXrrXWMM0\r\n"
                    + "                                                                                         zW@HXzzXWHHHMWXwrXWHM0.\r\n"
                    + "                                                                                         zWmHZuuyWHHHHWXXzXWMMk_\r\n"
                    + "                                                                                         wWHHWXXWWMMMNHZXXXWMMS_\r\n"
                    + "                                                                                         (WMNWXwWWMMMMHyXwXMMN>\r\n"
                    + "                                                                                     `   (wHMHHHHHHHHHHHHHHMMR>\r\n"
                    + "                                                                                      ` zMMMkmQkWMMNMMNHQmQkMMMD_\r\n"
                    + "                                                                                         jdMMHUXWHMNNMHW0XWMNNI`\r\n"
                    + "                                                                                         jMMNXwwXXMMMMkXw+XMMMI\r\n"
                    + "                                                                                         jMMNyXXyWMMMMWVXuXMMMS\r\n"
                    + "                                                                                         zMMNyZZfWMNMMpyXZyMMMR.\r\n"
                    + "                                                                                         dMMNyZXfWMMNMpyXuyMMMK_\r\n"
                    + "                                                                                         dMMNyZyfHMNMMfyXZyMNMH~\r\n"
                    + "                                                                                        .dMMHyZyfMMNMMHVuZyHNM#_\r\n"
                    + "                                                                                        .dMMHyZZfMMNNMHVXZyWNMN>\r\n"
                    + "                                                                                     `  (dMMWyuyfMMNMNHyXXyWNMNl\r\n"
                    + "                                                                                        (WMMfyZyfMM#NMHVXXyWNMMI\r\n"
                    + "                                                                                        jMNNfyuyfMM#NMHyZZyWNMMI\r\n"
                    + "                                                                                     `  zMMNVZuyfMN#NMHVZuyWNNMR_\r\n"
                    + "                                                                                       .dMMNVZZyfMN#NMHVZuyfMNM#_\r\n"
                    + "                                                                                       .dNMNVZuyfMN#NNHVZZyVMNMN>\r\n"
                    + "                                                                                     ` (dNMNWZZyfMNHNMHVZuyVMNMNc\r\n"
                    + "                                                                                       jWNNHyZZypMNHNMNfyuyVWNMMZ.\r\n"
                    + "                                                                                      .dMMMpyZZVpMNHNMNVyuZfWMMMK_\r\n"
                    + "                                                                                     `(dNMMpyZyVfMNHNMNVyZZWWMNM#:   `\r\n"
                    + "                                                                                      (dMNNfyZyVpMNHNNNfyZZyWMMMNI\r\n"
                    + "                                                                                  `   zWNNNfyZyVpMNH#NNpVZyVWMMMMZ_\r\n"
                    + "                                                                                     .dMMNHfyZyVWNNHMNNpVyZypMMMMK;\r\n"
                    + "                                                                                     (dNMMpVyZyVWNNHMMNfVyZyfMMMMNz\r\n"
                    + "                                                                                 `   zWNNNfVZZyfWNNH#NNpVyZyfMMMMNZ_\r\n"
                    + "                                                                                    (wMNNNfyyZyfWNNHMNMpVyZyfWMMMMK:\r\n"
                    + "                                                                                    (dNNNHfyZZVfWNNHMNMpfyZyypMMMMNo\r\n"
                    + "                                                                                  `.zWNMMHfyZyVpWNNHMNMHfVyyVfMMMMNZ_\r\n"
                    + "                                                                                `  (dMNMNfVyZyVpWN#@MNMHpVZZVfWMMMMR>\r\n"
                    + "                                                                                   +XNMNNpyyZyVfHNNHMNNHpVyZyfWMMNMNI_\r\n"
                    + "                                                                                  (zWNNNHfVyZyVpHNM@MMNHpfyZyfpMNMMMk<\r\n"
                    + "                                                                                  +dMMMMkpfVXWbpMMMHMMMNkpWyfppHMMMMNo.\r\n"
                    + "                                                                                 (zWMNNNpfyyyVpHMMM@MNMMpfVyyVfWMMMNNk<\r\n"
                    + "                                                                                 +wMNNMNpVyZZVfpMNN@MNNNppVyyyppMNMNMHz.\r\n"
                    + "                                                                          `  `  -zXMNNMHfVyZyVfpMNNHMNNNppVyyyfpHMNMNNZ<\r\n"
                    + "                                                                                +wWMNMMpfyyZyVfpMNNMMNNNpffyyyVfWMMNNMRz_\r\n"
                    + "                                                                               (zXMNMNNpfyyZyVfWMNNMMNNNppVyyyVfpMMNMMNw<\r\n"
                    + "                                                                          `    +wWMNNMbpVyyyyVfWNNNMMNNNbpfVyyVfpHNMNNMRz_\r\n"
                    + "                                                                              (zXMNMNMppyyZyyVfWNNNMM#NMbffVyyyfpWMMMMMNko.\r\n"
                    + "                                                                             .+wWMNNNNpfyyyyyVpWNNNHHNNMbpfVyWWfbkm@@H@HHkl`\r\n"
                    + "                                                                          `  (zXMNMNMbpVyyZyyVfWNNN#HMMMHkbppfpUWkqg@@@@Hkz- `\r\n"
                    + "                                                                            (+wWMNNNMppVyyyyyfpHMM@@@@@gmqkbVUfn (WqH@HHHHkO\r\n"
                    + "                                                                           .+wXMNMNMHpfyyyZyWWWH@@H@H@@@mkkbpn,?=- 7IdM@@Hkw>\r\n"
                    + "                                                                     `  `  (zXMMNNNMppfVWWWkqg@@HH@@@@M@mqkbppft (J~_+XWdHHkw.\r\n"
                    + "                                                                         `.+wXMNNNNMppfpbkkqmgggejWM@@N?Wqbppff\\    -(wX@@Hkko\r\n"
                    + "                                                                         .+zXMNNNNMgHffppkkqmmgg@NAzW@Hh`?U!zff} .U7TWYHdMHHkw-\r\n"
                    + "                                                                     `   (zwWMMMM@@Hpfffpbkqqmg@YYWNkXz<_ ``.pf~  `.,?HjkXMHHkO.\r\n"
                    + "                                                                        _+wXMMHgHggHWVVfVWbkqmgHHxrdHSvTWl  ?Wf[    _`_<dfk@HkXl\r\n"
                    + "                                                                       .+zwW@Hg@ggHpWV^  dbkqqWYCOrwuZTo_.+,`JfV+` ....dHHH@@Hkw<\r\n"
                    + "                                                                     ` (zwW@@@@gmmbW=  .k,(UHkQggQHNAAdh,.WkppfpVn.`(Hqg@HHH@HHXO.\r\n"
                    + "                                                                      _+dWH@@9HmqHpk. jVffe.?Hmg@@@H@@@gH,.HbppfVVW&..Wm@@@H@MmWXl   `\r\n"
                    + "                                                                  `  .+wWH@HXXdgkbppVo  ~??= (gg@H@@@@@@gHWqbppfVVfffn.Wg@H@HMHH0C~\r\n"
                    + "                                                                     (wWWm@@H9vHbpffVV+ `    .g@@@@H@HH@@gmkkbpppfVWWWWWNM#N#NNNkI<\r\n"
                    + "                                                                   `.zXWHHHXNdK(HpffVVW+JpkAXmg@@@HH@@@@@gHkppWWXuuZZyyyWNNN#NNNHwz_\r\n"
                    + "                                                                    (OWWHNWXWhd3OpfVVVVffpbkqmgg@@@HH@MHHHHfVyZuuvvuuZZyWMN#NNNNNRO<.\r\n"
                    + "                                                                `  .+dWH@@RGJHJ.(fVVyyVfppbqmqmg@HMM@MMM#MHVyZZuurrXuuZZyHNNNN#NNNXz_\r\n"
                    + "                                                                   (1dqgg@N9JWR+_JfVVVVVppbkqkqHNM@g@HH###HyyyZuuvrrzuuZyWMNNNNNNMRO<-\r\n"
                    + "                                                                 `.+zXHHH@@HHqkndffVVfffpbkHpH###H@@@HH###NyyyZuuzttwzuZyyMNNNNNNNHkz_   `\r\n"
                    + "                                                                  (1wXH@@@HMmqqkbpVVVVVWyyyyWM###H@@@H####NyyZZuuztlOruuZyW#NNNNNNNkO<.\r\n"
                    + "                                                                `.<zwWMH@H@gqkmqkpVfUUuuZZyyWM###H@@@H####MyZyZuuztz1OwuuZXMNNNNNNNHwz_\r\n"
                    + "                                                                 _+wXMNMH@@gqHgHHVY<+OwuZZZyW####H@@HH####MWZZZZuvOz~<zwuZZMNNNNNNNNkI<\r\n"
                    + "                                                                 (zwWMNM@@@mqHHUOz~~(zruuZZZW####H@HHH####MkZZuuuOv<~(1OwuZWNNNMNMNMKO<_\r\n"
                    + "                                                          `  `  .+zXHNNNM@gmWuuwl<~~(ztvzuZZW##NN#HHH##NNN#HZuuzvt=<~_1lrvuXMNMNMNNMNXz_\r\n"
                    + "                  `                                             (+wXMNNNMMMNuuurl<~_<=trzuuZWNNNN#HHH#NNNN#HZuuzvt=<~~<ltwuXMNMNNNMMNkI<\r\n"
                    + "             `  `                                               (zwWMNNMNNN#uzvtl<~~<ztrzuZyMNNNN#HHH#NNNNNHuzuzrtl<<~+ltzuuWNNMMNNMMkO<_\r\n"
                    + "               ```                                         ``` .<zzXMNNNNNN#uurtlz;<1zrvzuuZMNNNN#####NNNNNNuzzvvrlz<<ztrvzuXNNMMNNNNHZz_ `  ` `````\r\n"
                    + "                 `      `  `  `  `        `  `       `      `  _+OwWN#NNMNNHuuurtO11zrzzzuuXMNNNNN###NNNNNNNuzzzzrtO1zlrrvuuXMMNMMNMMHXI< `  ``    ``           `   `  `      `        `\r\n"
                    + "                 `  ``    ```   ``` ` ` `  `    ` ``   `   `   (1twMMMMMMMMSuXuvrtllwzuuzuXXMMMMMMMMMMMMMMMM0zzzzzvrtltwzzXXXMMMmMMMMNkZ<_   `      ``    ` `` `   `  `    ``  ` `  ``\r\n"
                    + "                ` `  ``               ``   ```  ``  ` ``   `   (zrXMMMHqMNNXzuuuOtttrruuXvzXMMHMNqqM#MqqMNMHuuuwrwuwltvvrvZZXMNqmMMMNMkO<_``  ``   `     ` `    ` ``   ``  ` `  ```  ``\r\n"
                    + "                `     `   ``    ``     `     `   `        ``  .<=wWNMMNqqMNXuzXXwwrrrvzZzwuXMHMNNNqqMMHqqMMHZZZuuuXwtzvzvvzuXHNqqMNNMNHXz_`       ` `     `      `     ` `  `     `   ``\r\n"
                    + "             `  ``    ``  ` `   ``    ` `   `  `   `` `   `   -<zwHNMMNNqqHyXzzzuuzzZzzzXyXXqMNNNNNqqH#NqqMMSuXXvwuwttzzuZXuuWNqmMMNMMNXv< `     ` `  `` ``       ``    `   `    `    `\r\n"
                    + "                 `  `  `   ` `   ```  ` `` `    ` `   `` `    _+zXHNMNNNNHHfyXuXZuuuZXuXyyyXHNNNNNNNHMNNNHMMkuXXzzuwrrwwwXXXXWMHmgHMHHNXI<     ``      `   ````    ` ` `   ` `  ``   ` `\r\n"
                    + "                                       `                      (+wXMNHNNNNNNVyyyZZZuuZyyyyyVW#NNNNNNNNNNN#NNMHyyZZZZZuuuZZyyVfWNNMMNNMNNXI<\r\n"
                    + "                                      `                       (1wXMNHNNNNNNfVyyZZZuZZyyyyVfW#NNNNNNNNNNNN#NMHfyyyyyuuzuZZyVVpWMNMNMMNMNXZ<`\r\n"
                    + "                                        `                     (zwXMNHNNNNNNfVyyyZZZZZZyVVVfW#NNNNNNNNNNNNNNMHVyyyyyZuuZZyyyfpWMNNMMNMNNSZ<_\r\n"
                    + "                                                              ` ??TWWMMMMMNfVyyyZZuZZZVVVVfWN#NNNNNNNNNNNNNMHVVyyyZZuuuZyyVfpWMMMMMMMMB=<``\r\n"
                    + "                                                               ..-+zOX0w<.` `   `  ```~!????\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"7?????!~~````   ` `.zXHHWXz_-..\r\n"
                    + "                                                               uWkmggggHmma+--...............(+(--..----.....................(+gQH@@@@gHWX:\r\n"
                    + "                                                              .uWkmg@@@@gmqkkbpppppfppbbkkkqmmmmgggmgHqqqmqmkkkbppffppfpppbkkmg@@@@@@@gHWX:    `\r\n"
                    + "                                                          `   .ZWkmg@g@gggmqkbpppppppppbbkkqqqmmgmmgmggmqmqqqkkkbbpppppfpbkkqmg@@@@H@MgkWX:\r\n"
                    + "                                                               ZWkmg@@@MgmmqkkbpppppfpbbkkqkqqmggmggmmmgmgHqqkkbbpbppppppbkqqqm@@@@H@@gkWu:\r\n"
                    + "                                                              .XWbqg@@@gggmqkkkbppppppbbkkkqqqmmmgHY\"\"YHgmqqqqqkbbpppppbbkkkqmmg@@H@@@gkWu:\r\n"
                    + "                                                              .uVbqg@@@@ggmkkkkbpppfppbbbkqqqqmmmB^````.?Hmqqqkkkbpppbppbbkkqmgg@@H@@@gkWu:\r\n"
                    + "                                                               uVbmgg@@ggggqkbbpbppppppbkkkkmmmmmr.````.`(Hqqqkkbbpppppppbkkqmg@@@H@H@mHWX!    `\r\n"
                    + "                                                               ZyWqg@@gg@gmqkkkbpppppppbbkkkqqqqUY ```` `.` 4kqkkbpbpppppbkqqqmg@@@@@@mHWX:\r\n"
                    + "                                                           `   Xybqg@gg@ggmqqkkbbppfppbbkkbHY=! ``````.`..```Xkkbbbbpbppbbkkqmg@@@H@@@gbWk!\r\n"
                    + "                                                               uybqmg@@@ggmqkkbbbppppppb9!``._-.````````... .WqkbbppbbbbbbkqqmgH@@@H@@mHWX!\r\n"
                    + "                                                               uWpqg@g@@@mgqkkbbbppppppt ```. _..``.g:```_Tqqkkkkbbbbbbpbkkkqmg@@@@@@@mby0_\r\n"
                    + "                                                          `    uWpqmg@@ggmmqqkbbpppppbph  ``.Qa.,`` O$ ```.dkkkkbbbbbbppbkkkqmgH@H@@@@mkyk!\r\n"
                    + "                                                               uypqggg@@ggmqkkkbbppppppbh. ``?\"!```` ````` ?T\"THbkRTWppbbkkkqmg@@@@@@@mHWX!    `\r\n"
                    + "                                                               ZWWqggg@@@gmmkkkbbbppbppbpk.``.+~``.c   ``````` (kbbl 4Wpbbkqqmg@H@@@@@mkWX!\r\n"
                    + "                                                          `    Xypkmg@gggggqkkkbbppbppbbbK```.- .`? (r``(-.````.HbpW. (pbkkqmmg@@@@H@gmHWk~\r\n"
                    + "                                                               Zypkgg@@g@gmmqkkbpppppbbbW'` (qHU= `` = ` 7HWm+.Xbbbp} `(pkkqmmH@@@@@@@mbWX~ `\r\n"
                    + "                                                               Zypkg@gg@@gmqqkkbbpbppbpK!` df~```?<  u_``` 4kkbkkbbp}   ?kkqmggg@@@@@gmHWz_\r\n"
                    + "                                                              `Xypkm@@@H@mmqqqkbbbbbpWY``.gqH,.`` .``` ```.Wqqkkkbbp} ` `jkqqg@g@@@@@gmbWu~\r\n"
                    + "                                                          `   `Xypkgg@gg@ggqqqkkbbpWY!  .WkqkmP````   ````` WkkkkbbW~   `,bqqmggHH@@@gmbWz~\r\n"
                    + "                                                              `Xypkmg@@@MgmqqkHYCi(.+kAaXkqqqqh.``  `  ```./-7Hkkkpt `  `jkqqgmgg@@@@@qbyX~    `\r\n"
                    + "                                                              `Zypkm@@g@gggqkkkbbppbpbbbbkkqHUY`` `   ` `` .!.(kWY=`  ` `Wkqmggg@@@@@@qHyX~ `\r\n"
                    + "                                                          `   `XXfkmggH@ggmmqkkkbbbbbpbbkqq>..``..d=  T+zTY7\"7!       `  Wqqmmgg@@@@@gqpWX~\r\n"
                    + "                                                               wypkmgH@@gggmqqkkkbbbbbkbkqqo-_ .qkR.` ````````  `  ` ` .Jkqqqmgg@@@@@mqpVk~\r\n"
                    + "                                                               wyWkmg@@gggmmqqkkkbbbbkbkkqqkHQWqkkkke.  ``````` ```..(Xkkkkmmmg@@@@@@gqpWV~ `\r\n"
                    + "                                                          `    wyfkqg@gggmgmqkkkkbbbbbbkqkqqqqmmqqkkkHma+J.....(+Xbbpbkkkqqqmg@gg@@@gmqpyX~\r\n"
                    + "                                                               dyfkmgg@@ggmmqqqkkkkbbkkkkkkqqqmqqqkqkqqqqqkqmqqqkkbbbbbkkkqqmmHg@@@@ggqpWu~\r\n"
                    + "                                                               wyfbmgg@gggmmqqkkbkbkbbkkkqqqqHmqqkqkqkqqqqmmqqqqkqkkkkkkkkqmmmg@@@@@ggqpWX~`\r\n"
                    + "                                                          `    wyfbmgg@gggmmqkkkkkbkkkqkqkqH\\`_WkkkqqkqqqqqmHBWHqkkkkkkkqqkqmggg@@@@gmkpyX~\r\n"
                    + "                                                               wyfbqgg@@gggmqqkkkkbkbkkkkqqqH ` 7HkkkqqqqmH=``` ?HkkkqkkkqqqmgH@@g@@ggkpyw~\r\n"
                    + "                                                               wyfbmggg@gHgqqqqkkkkbkkk9\"YY\"^.``` ?HqqqkqqqR `  `(kkkkkqkqqqmggH@g@@@mkpWX~`   `\r\n"
                    + "                                                          `    wyVbqgg@@gHqqqkkkkkbbbb$` ```.``  `.dkkkqqqY``` ..dkWWkkkkqqqmggg@@@@gmqWyX_\r\n"
                    + "                                                               wyVpqmgH@ggmmmqkkkkkkWbW.` ``````(7\"TWkkHY!..dWHkb9=`  4kkqqqmmg@@@@@gmqpyX~\r\n"
                    + "                                                               wZfbqg@g@@gmmqqkqkkkH_ 7HmJ.` .``` `  T!``.dqqHY=``  `` 4kqqqmg@@@@@@gmkWZX~ `\r\n"
                    + "                                                          `    wZfbkgggg@mgmqqqkqbbb: ` 7=~`.. .,`    , `.T\"!```  ` ` .dkqqqmg@g@g@@gmkpWX~\r\n"
                    + "                                                              `wZfbqmmg@ggmmqqkqkkkkn. ` ..?!`` ^ ` ``w` `````  ` .JWkkqqqqqmmgg@@gggmqpy0~    `\r\n"
                    + "                                                              .wyfbqqmg@mgmqqqqqkqqkkH+ `(-.```` ` .JWD` ``..` `.Wkkkkkqkqqqmmggg@@ggmkpyu~ `\r\n"
                    + "                                                          `   `uyfbkmggggmmmmqqqkkqkkkko` T^ ```` .kbb\\ ``.W}`  `?qqqkkqqqqqmmgg@@@ggmqpWu~\r\n"
                    + "                                                              `XyfbkmmgHgggmqqkkkkkkkqqH! ``.`` `,Y1W$ `  dq}`` `.qkkqqqkqqmmgmg@@g@gqkpWu!\r\n"
                    + "                                                              `XZfpqmmggggmmmqqkqkkkqkkk.``.,` _` .df` ``(qq}` `.mqqkqkkqqqmmmgg@g@ggqkpWu_\r\n"
                    + "                                                               uZfbkmmgggmmgqmqkqqqqkHY!.(7!````.Hkf` ` .qqm}`  Jqkqkqqqqqmmmmggggg@gqkpyX!\r\n"
                    + "                                                          `    uyfpkqgmgggmqmqqqkkUY! ``` ``..`.dqf`.-..qqqq:`` (qqkqqkqqqqmmgggg@@gmqkpyu_\r\n"
                    + "                                                               uZfpkqmgmgmmmmqqqk$   ` ..gWB' `Jqf((kkkqqqqm:`` .qqqqqqkqqmmmgggggggmqkpyu!\r\n"
                    + "                                                               wZfbkqmmgmmmmqqqkqkmaJJgkqqma,``(qqqkkqqqqqmm_`  .qkqqqqqqmmmmmgg@gggmqbWyu!    `\r\n"
                    + "                                                          `    uZVpkqmmmmgmmqmqqkkqqqqqqqqmmn` (qqqqqqqqqmmm_` `.qqqqkqqmqmmmmmgggggmqbfyu!\r\n"
                    + "                                                               uZVpkqmgmmgmmmqqqqqkqkmkqqqmmmmdmmqqqkqqqqmmt``  .Hqqqqqqqqmmmggmggggmqkfyu!\r\n"
                    + "                                                               zyVpkqqmmmmmmmqqkqkkqqqqqqmggggggmmqkkqqqmmmn``` .mqqqqqqqmmmmgmgggggmqbpWX!\r\n"
                    + "                                                          `    uZfbkHHHHgmmmmqmqqqqqqqqmmmggggggmmmqqqqqmmgH!`` .gqqqqqqqqmmmgmgggggqkbfWX!\r\n"
                    + "                                                               uyfpk0rrrw0XXqmqqkqqqqqqmmgmmmmmmmmmmqqmmggmgh,.JWmmmqqqqqqqmgmggggmmmqbpyz_    `\r\n"
                    + "                                                               uyfpk0vkZUWkwqmqmmqqqqqmmmggmgggmggmmqmqmmggmgmmmgqmqqqqmmmmmmggmgggmqkbfyu!\r\n"
                    + "                                                               uZfbkkXXXwWVwqmmmqqqqH`(mHWHmggHHggmmHBHmmgmmmHmHWY\"THmqYUqmmggggggmmqkbfWu!\r\n"
                    + "                                                              .uyfbkkwkOdUwdmmmqmqqH'  7! (ggH{ WgmgK`jY dgg[.HP .Z`.qq\\.HmmmgggggmmmqbfXu!\r\n"
                    + "                                                              .uyppkkwkrXSXdmmmqqHY` +. e JgB^ .74g0! ..WmmK`Jm: `..Xq$ WmmgggmggggmqkbfWu<    `\r\n"
                    + "                                                              .Zyfpkmwz0rkwdmmmmq[ .dqhJ8 (H  .-.HR ...7TAY`.g% (+ ?4K (mmmggmggmgmmqqbfyu:\r\n"
                    + "                                                              .ZyfpkqqmmmHkmmmmqqb.XqmmmH,.gedgH-XH.WgH.(gh.Wmh(mmHadqQWmqmmmgmmHHHmqqpWWu:`\r\n"
                    + "                                                          `   .Zyfpkqqqmgmgmgmmmqqqmmmmmmmmgggggggggggggg@ggggmmgmmmmmqqmmgmHyWVHWW9UC1?dZ:\r\n"
                    + "                                                              .uyfpkqqmmgmmmmmmmmmmmmmgggmggggggggggggg@gggggggggmmmmmmmmmmmH11?>???????du:\r\n"
                    + "                                                              `?7Wpkkqmmmgmgmmmmgmmgmmgmggggggg@gggg@gg@gg@gggggggmmgmmmmggmH;>>?????=1z7!``   `\r\n"
                    + "                                                              -.`.._?\"YWHmgmmmmmgmmmgmmggmggg@@g@@@@@gg@@@gggggggmggmgmmmggmH>++&&z77!... .\r\n"
                    + "                                                          `   <zw&-.-..``` `~?7\"\"TYUWHHHHmmgggg@g@gg@gg@gg@ggggmmHHHWBYY\"\"\"7!~```....-(Jzz~\r\n"
                    + "                                                              <zvZyfpkkQJ-... `` `  `  ` `````. ```````````  `` `  `  ` ` `  ...J&QWkpyuOz~\r\n"
                    + "                                                              (zvZVpbkqmmmmqqqqHkkQQa+JJ-........................-(J+gQQkWkqmmmmqqqkbpyuOv_\r\n"
                    + "                                                          `   (1wXWbkkqmggggggggg@@@@@@@@@@@HHHHHHHHHHHHHHHH@@@@@@@@@gg@ggggggggmmqkbpyuO<\r\n"
                    + "                                                               +tXXpkqmgg@@g@@@@@@@@@@@@@@@HHHHHHHHHHHHHHHHH@@@@@@@@@@@@@@@@@@@@ggmqbpyzI<\r\n"
                    + "                                                               (OXyWkHqg@g@@@@@@@H@@@@H@@H@@HHHHHHHHHHHHHHHHHHH@H@@@@@@@@@@@@@@@@gmqkWZwv`\r\n"
                    + "                                                                1wXpbqmg@@@@@@@@@@@@@HH@HH@@HHHHHHHHHHHHHHHHH@H@@H@@H@@H@@H@@H@@@gmqkW0C!\r\n"
                    + "                                                                .jXWbkmg@@@@@@@H@H@@H@@@H@HHHHHHHHHHHHH#HHHHH@HHH@HH@H@HH@HH@H@@@gHHWXI!\r\n"
                    + "                                                                  +ZWHqgg@@@HHH@H@H@@HHH@HHHHHHHHHHHH#H#HHHHHHH@HH@HH@HH@HH@@@@@ggHH0I`\r\n"
                    + "                                                                   ??UWHHH@@@HHHHHHHHHHHHHHHHHHHHHH#HH#H#HHHHHHHHHHHHHHHHHHHH@MHHHUC<`\r\n"
                    + "                                                                      _<?TTWHH@@@@HHHH@HHHHHHHHH###H##HHH#HHHHHHHHHHHHMMMMHHH9Y7<~`\r\n"
                    + "                                                                              _!?77TYYWHMMMMMMMHHHHHHHHHMMMMMMMMHHY9YT77?!``";
            break;
        }
            
    }
    
    public void print() {
        System.out.println(name);
        System.out.println(view);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
        
    }

}
