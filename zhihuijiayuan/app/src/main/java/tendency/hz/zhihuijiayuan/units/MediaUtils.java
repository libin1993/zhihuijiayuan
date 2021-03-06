package tendency.hz.zhihuijiayuan.units;

import android.media.MediaPlayer;
import android.media.SoundPool;

import tendency.hz.zhihuijiayuan.application.MyApplication;

/**
 * Author：Li Bin on 2019/7/16 11:34
 * Description：
 */
public class MediaUtils {
    private static MediaUtils mInstance;
    private MediaPlayer mediaPlayer;

    private MediaUtils() {

    }

    public static MediaUtils getInstance() {
        if (mInstance == null) {
            synchronized (MediaUtils.class) {
                if (mInstance == null) {
                    mInstance = new MediaUtils();
                }
            }
        }
        return mInstance;
    }


    /**
     * 播放提示音
     *
     * @param rid
     */
    public void playAudio(int rid) {
        stopAudio();
        mediaPlayer = MediaPlayer.create(MyApplication.getInstance(), rid);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopAudio();

            }
        });

    }


    public void stopAudio() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.reset();
            mediaPlayer.release();
            mediaPlayer = null;
        }

    }
}
