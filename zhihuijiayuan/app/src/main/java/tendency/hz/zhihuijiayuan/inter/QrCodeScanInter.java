package tendency.hz.zhihuijiayuan.inter;

/**
 * Created by JasonYao on 2018/4/11.
 */

public interface QrCodeScanInter {

    /**
     * 获取扫描结果
     */
    void getQrCodeScanResult(String result,String callBack);
}
