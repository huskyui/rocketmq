package org.apache.rocketmq.srvutil;

/**
 * @author 王鹏
 */
public class FileCheckTest {
    public static void main(String[] args) throws Exception {
        FileWatchService fileWatchService =new FileWatchService(new String[]{"d://a.txt", "d://b.txt"}, new FileWatchService.Listener() {
            @Override
            public void onChanged(String path) {
                System.out.println(path+"file changed");
            }
        });
        fileWatchService.start();
    }
}
