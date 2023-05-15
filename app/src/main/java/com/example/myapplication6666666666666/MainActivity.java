package com.example.myapplication6666666666666;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final ViewPager2 videosviewpager= findViewById(R.id.videosViewpager);



        List<VideoItem> videoItems =new ArrayList<>();

        VideoItem videoItemCelebration = new VideoItem();
        videoItemCelebration.videoURL ="https://video.xx.fbcdn.net/v/t42.1790-2/340887939_1341760459887758_1780638842476577695_n.mp4?_nc_cat=100&ccb=1-7&_nc_sid=985c63&efg=eyJybHIiOjU0MSwicmxhIjo1MTIsInZlbmNvZGVfdGFnIjoic3ZlX3NkIn0%3D&_nc_ohc=yY2ArMdiEDIAX8HoSof&rl=541&vabr=301&_nc_ht=video-iad3-2.xx&oh=00_AfB2EAGCfrNbcI4W-g0Ey2ckYCvk7U0R2FkEfTzCtHxGbw&oe=6468029D";
        videoItemCelebration.videoTitle="Egypt";
        videoItemCelebration.videoDescription="ComeTOEgypt";
        videoItems.add(videoItemCelebration);


        VideoItem videoItemCelebration1 = new VideoItem();
        videoItemCelebration1.videoURL ="https://video-hbe1-1.xx.fbcdn.net/v/t39.25447-2/335953438_742126187617441_6372109681437290459_n.mp4?_nc_cat=110&vs=6a3d57cc8ae91161&_nc_vs=HBksFQAYJEdCNF9CaFNobk1xMzlhSUNBTnV2NVktX1IyNVlibWRqQUFBRhUAAsgBABUAGCRHTHRXOVJQTkprVi1wNUlDQUhwdEZFdTF6Y2hGYnJGcUFBQUYVAgLIAQBLB4gScHJvZ3Jlc3NpdmVfcmVjaXBlATENc3Vic2FtcGxlX2ZwcwAQdm1hZl9lbmFibGVfbnN1YgAgbWVhc3VyZV9vcmlnaW5hbF9yZXNvbHV0aW9uX3NzaW0AKGNvbXB1dGVfc3NpbV9vbmx5X2F0X29yaWdpbmFsX3Jlc29sdXRpb24AHXVzZV9sYW5jem9zX2Zvcl92cW1fdXBzY2FsaW5nABFkaXNhYmxlX3Bvc3RfcHZxcwAVACUAHIwXQAAAAAAAAAAREQAAACaCr8DL1%2F6RAhUCKAJDMxgLdnRzX3ByZXZpZXccF0Ad3S8an753GCdkYXNoX3IyX2F2Y19nZW4xYXZjX2xjX3E4MF9mcmFnXzJfdmlkZW8SABgYdmlkZW9zLnZ0cy5jYWxsYmFjay5wcm9kOBJWSURFT19WSUVXX1JFUVVFU1QbCogVb2VtX3RhcmdldF9lbmNvZGVfdGFnBm9lcF9oZBNvZW1fcmVxdWVzdF90aW1lX21zATAMb2VtX2NmZ19ydWxlB3VubXV0ZWQTb2VtX3JvaV9yZWFjaF9jb3VudAYxNjczMzcRb2VtX2lzX2V4cGVyaW1lbnQADG9lbV92aWRlb19pZA81ODc3MTI3NzY2MDM0NzcSb2VtX3ZpZGVvX2Fzc2V0X2lkEDM1MDkzNDM5NjYwMjA2NzEVb2VtX3ZpZGVvX3Jlc291cmNlX2lkDzYwMjUwOTc2ODM5NTcxMxxvZW1fc291cmNlX3ZpZGVvX2VuY29kaW5nX2lkEDU5ODQ1MzA2ODE2NjgyMzIOdnRzX3JlcXVlc3RfaWQAJQIcACXEARsHiAFzBDg2MDICY2QKMjAyMy0wMy0xNQNyY2IGMTY3MzAwA2FwcBnigI5GYWNlYm9vayBmb3IgaVBob25l4oCOAmN0DkZCX1NIT1JUU19QT1NUE29yaWdpbmFsX2R1cmF0aW9uX3MFNy41NDcCdHMVcHJvZ3Jlc3NpdmVfZW5jb2RpbmdzAA%3D%3D&ccb=1-7&_nc_sid=632d04&efg=eyJ2ZW5jb2RlX3RhZyI6Im9lcF9oZCJ9&_nc_ohc=tu4dQy_-LUQAX94YvZe&_nc_ht=video-hbe1-1.xx&oh=00_AfDCHQ6PNOhIjCpbPFsFjZdtztPMoT8BAVMpZDDCYMqOFw&oe=6466938B&_nc_rid=366749776252013";
        videoItemCelebration1.videoTitle="Egypt";
        videoItemCelebration1.videoDescription="ComeTOEgypt";
        videoItems.add(videoItemCelebration1);



        VideoItem videoItemQuran4= new VideoItem();
        videoItemQuran4.videoURL="https://video.fcai19-4.fna.fbcdn.net/v/t42.1790-2/343715765_956152208844268_8274200478829479403_n.mp4?_nc_cat=105&ccb=1-7&_nc_sid=985c63&efg=eyJybHIiOjU0MywicmxhIjo1MTIsInZlbmNvZGVfdGFnIjoic3ZlX3NkIn0%3D&_nc_ohc=XsAIhwZYzz0AX8KJuv9&_nc_rml=0&_nc_ht=video.fcai19-4.fna&oh=00_AfB_E43aJKoZLeoVwTf-FhXtPRZbIEbK5-zQLmJRZvHnUg&oe=6467BB95";
        videoItemQuran4.videoTitle="Travel";
        videoItemQuran4.videoDescription="asddddddddddddddddddddddddddsdsad \uD83D\uDC99\uD83D\uDC99";
        videoItems.add(videoItemQuran4);

        VideoItem videoItemParty1= new VideoItem();
        videoItemParty1.videoURL="https://scontent.fcai19-4.fna.fbcdn.net/v/t50.33967-16/346868494_177395871583343_8694593900673742581_n.mp4?_nc_cat=103&ccb=1-7&_nc_sid=985c63&efg=eyJybHIiOjQ1NzIsInJsYSI6MTAyNCwidmVuY29kZV90YWciOiJ4cHZfaGRfcHJvZ3Jlc3NpdmUifQ%3D%3D&_nc_ohc=3IW8bupG6vwAX8j4EtU&rl=4572&vabr=3048&_nc_ht=scontent.fcai19-4.fna&oh=00_AfANy18QIPTEm5hJeWxv4jdRkrOJ30g3VglhANc-8alKDA&oe=64667148";
        videoItemParty1.videoTitle="Egypt";
        videoItemParty1.videoDescription="Welcome to the countery of history EGYPT";
        videoItems.add(videoItemParty1);


        VideoItem videoItemParty= new VideoItem();
        videoItemParty.videoURL="https://video.fcai19-4.fna.fbcdn.net/v/t39.25447-2/345453416_802813527934512_1267524265376085182_n.mp4?_nc_cat=104&vs=ef24fa1b5b38542a&_nc_vs=HBksFQAYJEdHZ3pseFF3UmllWEo5b0NBTDcwN1kyYUpwY1JibWRqQUFBRhUAAsgBABUAGCRHTzlRa2hORU5QLWxVZTRFQUZRUVJHNklyY1E1YnY0R0FBQUYVAgLIAQBLB4gScHJvZ3Jlc3NpdmVfcmVjaXBlATENc3Vic2FtcGxlX2ZwcwAQdm1hZl9lbmFibGVfbnN1YgAgbWVhc3VyZV9vcmlnaW5hbF9yZXNvbHV0aW9uX3NzaW0AKGNvbXB1dGVfc3NpbV9vbmx5X2F0X29yaWdpbmFsX3Jlc29sdXRpb24AHXVzZV9sYW5jem9zX2Zvcl92cW1fdXBzY2FsaW5nABFkaXNhYmxlX3Bvc3RfcHZxcwAVACUAHIwXQAAAAAAAAAAREQAAACbkoJ%2FX0YSEAxUCKANDM2UYC3Z0c19wcmV2aWV3HBdAOfdLxqfvnhgnZGFzaF9yMl9hdmNfZ2VuMWF2Y19sY19xODBfZnJhZ18yX3ZpZGVvEgAYGHZpZGVvcy52dHMuY2FsbGJhY2sucHJvZDgSVklERU9fVklFV19SRVFVRVNUGwqIFW9lbV90YXJnZXRfZW5jb2RlX3RhZwZvZXBfaGQTb2VtX3JlcXVlc3RfdGltZV9tcwEwDG9lbV9jZmdfcnVsZQd1bm11dGVkE29lbV9yb2lfcmVhY2hfY291bnQFMTA3NjYRb2VtX2lzX2V4cGVyaW1lbnQADG9lbV92aWRlb19pZA83NjU3NzI2OTUxNDkzOTESb2VtX3ZpZGVvX2Fzc2V0X2lkDzczNDU0OTgyMTM2MjY3MhVvZW1fdmlkZW9fcmVzb3VyY2VfaWQPODUzMzAwNzA1NzQ5MDQyHG9lbV9zb3VyY2VfdmlkZW9fZW5jb2RpbmdfaWQPNzk1OTE3MDgxNjQwMjY2DnZ0c19yZXF1ZXN0X2lkACUCHAAlxAEbB4gBcwQxODUyAmNkCjIwMjMtMDItMDgDcmNiBTEwNzAwA2FwcBrigI5GYWNlYm9vayBmb3IgQW5kcm9pZOKAjgJjdA5GQl9TSE9SVFNfUE9TVBNvcmlnaW5hbF9kdXJhdGlvbl9zCTI2LjAwNDQ0NAJ0cxVwcm9ncmVzc2l2ZV9lbmNvZGluZ3MA&ccb=1-7&_nc_sid=632d04&efg=eyJ2ZW5jb2RlX3RhZyI6Im9lcF9oZCJ9&_nc_ohc=Pjzxbdiw7lAAX9z9-CP&_nc_ht=video.fcai19-4.fna&oh=00_AfBWiy5pH6_6fFUVGUROU_rKJ0zOsSB-eBnaBOSYrjDM2Q&oe=64675883&_nc_rid=836770738185182";
        videoItemParty.videoTitle="party";
        videoItemParty.videoDescription="asddddddddddddddddddddddddddsdsad";
        videoItems.add(videoItemParty);


        VideoItem videoItemTravel0= new VideoItem();
        videoItemTravel0.videoURL="https://video.fcai19-4.fna.fbcdn.net/v/t39.25447-2/344371736_617901843564340_4281497651586252380_n.mp4?_nc_cat=101&vs=ceb43a711bf672ba&_nc_vs=HBksFQAYJEdCaXloaFEwUl9SN19qRUNBRnlfZHdWdTcybzdibWRqQUFBRhUAAsgBABUAGCRHQnllZVJSejA5RHpDTEVHQUZRQ3M4WG9NVU1zYnJGcUFBQUYVAgLIAQBLB4gScHJvZ3Jlc3NpdmVfcmVjaXBlATENc3Vic2FtcGxlX2ZwcwAQdm1hZl9lbmFibGVfbnN1YgAgbWVhc3VyZV9vcmlnaW5hbF9yZXNvbHV0aW9uX3NzaW0AKGNvbXB1dGVfc3NpbV9vbmx5X2F0X29yaWdpbmFsX3Jlc29sdXRpb24AHXVzZV9sYW5jem9zX2Zvcl92cW1fdXBzY2FsaW5nABFkaXNhYmxlX3Bvc3RfcHZxcwAVACUAHIwXQAAAAAAAAAAREQAAACb2wpK5kri6CxUCKAJDMxgLdnRzX3ByZXZpZXccF0AniDEm6XjVGCdkYXNoX3IyX2F2Y19nZW4xYXZjX2xjX3E4MF9mcmFnXzJfdmlkZW8SABgYdmlkZW9zLnZ0cy5jYWxsYmFjay5wcm9kOBJWSURFT19WSUVXX1JFUVVFU1QbCogVb2VtX3RhcmdldF9lbmNvZGVfdGFnBm9lcF9oZBNvZW1fcmVxdWVzdF90aW1lX21zATAMb2VtX2NmZ19ydWxlB3VubXV0ZWQTb2VtX3JvaV9yZWFjaF9jb3VudAU3MDAzOBFvZW1faXNfZXhwZXJpbWVudAAMb2VtX3ZpZGVvX2lkDzIyOTk3Mjc1OTY3Nzc0NRJvZW1fdmlkZW9fYXNzZXRfaWQPMjE1ODAwMjU3ODQxNDE0FW9lbV92aWRlb19yZXNvdXJjZV9pZBAzMjI0NzMyNjQxMTUzMjExHG9lbV9zb3VyY2VfdmlkZW9fZW5jb2RpbmdfaWQPMTEyNjk4Mzc1MTQ4ODc4DnZ0c19yZXF1ZXN0X2lkACUCHAAlxAEbB4gBcwQyNDIwAmNkCjIwMjMtMDUtMDEDcmNiBTcwMDAwA2FwcBrigI5GYWNlYm9vayBmb3IgQW5kcm9pZOKAjgJjdA5GQl9TSE9SVFNfUE9TVBNvcmlnaW5hbF9kdXJhdGlvbl9zBjExLjc5NgJ0cxVwcm9ncmVzc2l2ZV9lbmNvZGluZ3MA&ccb=1-7&_nc_sid=632d04&efg=eyJ2ZW5jb2RlX3RhZyI6Im9lcF9oZCJ9&_nc_ohc=LPo0ZHkkv5gAX8Eh3di&_nc_ht=video.fcai19-4.fna&oh=00_AfC6TZSxZiCNhySg5RGwA2EmtPUWCBqFg73wTDqaUzgQpg&oe=64675DCC&_nc_rid=088941444924862";
        videoItemTravel0.videoTitle="Travel";
        videoItemTravel0.videoDescription="asddddddddddddddddddddddddddsdsad";
        videoItems.add(videoItemTravel0);


        VideoItem videoItemTravelsiwa= new VideoItem();
        videoItemTravelsiwa.videoURL="https://video.fcai19-4.fna.fbcdn.net/v/t39.25447-2/346270058_546153367705352_2384559104013776791_n.mp4?_nc_cat=102&vs=88298e2a2ce958a5&_nc_vs=HBksFQAYJEdHcXBveFFJbDNrOXVmQUJBSmMzcWdUZnB4Y2hibWRqQUFBRhUAAsgBABUAGCRHTV9GZmhOZ0E2cS16dzhEQUlmN0hQV2RGNzhIYnY0R0FBQUYVAgLIAQBLB4gScHJvZ3Jlc3NpdmVfcmVjaXBlATENc3Vic2FtcGxlX2ZwcwAQdm1hZl9lbmFibGVfbnN1YgAgbWVhc3VyZV9vcmlnaW5hbF9yZXNvbHV0aW9uX3NzaW0AKGNvbXB1dGVfc3NpbV9vbmx5X2F0X29yaWdpbmFsX3Jlc29sdXRpb24AHXVzZV9sYW5jem9zX2Zvcl92cW1fdXBzY2FsaW5nABFkaXNhYmxlX3Bvc3RfcHZxcwAVACUAHIwXQAAAAAAAAAAREQAAACbmpfemrrrhBBUCKAJDMxgLdnRzX3ByZXZpZXccF0Ak7peNT987GClkYXNoX2k0bGl0ZWJhc2ljXzVzZWNnb3BfaHEyX2ZyYWdfMl92aWRlbxIAGBh2aWRlb3MudnRzLmNhbGxiYWNrLnByb2Q4ElZJREVPX1ZJRVdfUkVRVUVTVBsKiBVvZW1fdGFyZ2V0X2VuY29kZV90YWcGb2VwX2hkE29lbV9yZXF1ZXN0X3RpbWVfbXMBMAxvZW1fY2ZnX3J1bGUHdW5tdXRlZBNvZW1fcm9pX3JlYWNoX2NvdW50AzgxNBFvZW1faXNfZXhwZXJpbWVudAAMb2VtX3ZpZGVvX2lkEDEwMTIxNDk3NzY0MDk1MzYSb2VtX3ZpZGVvX2Fzc2V0X2lkDzczMDEzMTI4ODcxNzUyMRVvZW1fdmlkZW9fcmVzb3VyY2VfaWQQMTM0MDIwNzgwOTg4MjQ4MxxvZW1fc291cmNlX3ZpZGVvX2VuY29kaW5nX2lkDzc3NDk4NjYyNDI4MzAxMg52dHNfcmVxdWVzdF9pZAAlAhwAJcQBGweIAXMENTE5MgJjZAoyMDIzLTAxLTI2A3JjYgM4MDADYXBwGuKAjkZhY2Vib29rIGZvciBBbmRyb2lk4oCOAmN0DkZCX1NIT1JUU19QT1NUE29yaWdpbmFsX2R1cmF0aW9uX3MGMTAuNDk2AnRzFXByb2dyZXNzaXZlX2VuY29kaW5ncwA%3D&ccb=1-7&_nc_sid=632d04&efg=eyJ2ZW5jb2RlX3RhZyI6Im9lcF9oZCJ9&_nc_ohc=vhIMiWdaGb0AX_cXeNX&_nc_ht=video.fcai19-4.fna&oh=00_AfDqELUbpUCd3TdHzEyMA0jOE387SDdZzFjJ4xF29Ci6Eg&oe=64682E57&_nc_rid=185683857008785";
        videoItemTravelsiwa.videoTitle="Travel";
        videoItemTravelsiwa.videoDescription="Siwa Egypt .\uD83D\uDC99";
        videoItems.add(videoItemTravelsiwa);


        VideoItem videoItemExercise= new VideoItem();
        videoItemExercise.videoURL="https://joy1.videvo.net/videvo_files/video/free/video0474/large_watermarked/_import_61f228f0a5c801.56310378_preview.mp4";
        videoItemExercise.videoTitle="party";
        videoItemExercise.videoDescription="asddddddddddddddddddddddddddsdsad";
        videoItems.add(videoItemExercise);


        VideoItem videoItemQuran1= new VideoItem();
        videoItemQuran1.videoURL="https://scontent.fcai19-4.fna.fbcdn.net/v/t50.33967-16/345137440_786447192826150_1279529057703340685_n.mp4?_nc_cat=101&ccb=1-7&_nc_sid=985c63&efg=eyJybHIiOjE1MDAsInJsYSI6MTAyNCwidmVuY29kZV90YWciOiJ4cHZfaGRfcHJvZ3Jlc3NpdmUifQ%3D%3D&_nc_ohc=y4-hl_TJCPgAX_X5put&rl=1500&vabr=846&_nc_ht=scontent.fcai19-4.fna&oh=00_AfDbieJ_lEHpSrTNBQwcKxCojZT3oLDm2-TBicXG3IF4Bw&oe=64681615";
        videoItemQuran1.videoTitle="Quran";
        videoItemQuran1.videoDescription="إخفض صوت العالم قليلاً واستمع";
        videoItems.add(videoItemQuran1);

        VideoItem videoItemQuran0= new VideoItem();
        videoItemQuran0.videoURL="https://video.fcai19-4.fna.fbcdn.net/v/t39.25447-2/343177383_1375159213028407_5264940904104115902_n.mp4?_nc_cat=105&vs=6777b01ce40c19b3&_nc_vs=HBksFQAYJEdLZDRkQlEzOUdZMHNfSUVBTDZfaklEYjB4QkpibWRqQUFBRhUAAsgBABUAGCRHUGEtYUJTM2M4RGxIN29DQUhjRm9PU3g3ZTRRYnJGcUFBQUYVAgLIAQBLB4gScHJvZ3Jlc3NpdmVfcmVjaXBlATENc3Vic2FtcGxlX2ZwcwAQdm1hZl9lbmFibGVfbnN1YgAgbWVhc3VyZV9vcmlnaW5hbF9yZXNvbHV0aW9uX3NzaW0AKGNvbXB1dGVfc3NpbV9vbmx5X2F0X29yaWdpbmFsX3Jlc29sdXRpb24AHXVzZV9sYW5jem9zX2Zvcl92cW1fdXBzY2FsaW5nABFkaXNhYmxlX3Bvc3RfcHZxcwAVACUAHIwXQAAAAAAAAAAREQAAACbqne3xib6VAhUCKAJDMxgLdnRzX3ByZXZpZXccF0AvzMzMzMzNGCdkYXNoX3IyX2F2Y19nZW4xYXZjX2xjX3E4MF9mcmFnXzJfdmlkZW8SABgYdmlkZW9zLnZ0cy5jYWxsYmFjay5wcm9kOBJWSURFT19WSUVXX1JFUVVFU1QbCogVb2VtX3RhcmdldF9lbmNvZGVfdGFnBm9lcF9oZBNvZW1fcmVxdWVzdF90aW1lX21zATAMb2VtX2NmZ19ydWxlB3VubXV0ZWQTb2VtX3JvaV9yZWFjaF9jb3VudAQ4MjA4EW9lbV9pc19leHBlcmltZW50AAxvZW1fdmlkZW9faWQQMTQ0MjUyNDc3OTYxODM2MRJvZW1fdmlkZW9fYXNzZXRfaWQPNTY4NTI4ODQ1MzQ2MDQzFW9lbV92aWRlb19yZXNvdXJjZV9pZA82MTAxOTU5MjEwMjA3ODkcb2VtX3NvdXJjZV92aWRlb19lbmNvZGluZ19pZA8yNTI4ODg3MTA0Njg1MTgOdnRzX3JlcXVlc3RfaWQAJQIcACXEARsHiAFzBDkwMTMCY2QKMjAyMy0wNC0yNQNyY2IEODIwMANhcHAa4oCORmFjZWJvb2sgZm9yIEFuZHJvaWTigI4CY3QORkJfU0hPUlRTX1BPU1QTb3JpZ2luYWxfZHVyYXRpb25fcwYxNS45NTMCdHMVcHJvZ3Jlc3NpdmVfZW5jb2RpbmdzAA%3D%3D&ccb=1-7&_nc_sid=632d04&efg=eyJ2ZW5jb2RlX3RhZyI6Im9lcF9oZCJ9&_nc_ohc=6QuA4wfGZfUAX-E6oQI&_nc_ht=video.fcai19-4.fna&oh=00_AfDrgrv8Qh43AjCpla31Re3jkpW4yQAsxMZ2ILNCTiEK1w&oe=64667088&_nc_rid=420083016908778";
        videoItemQuran0.videoTitle="Quran";
        videoItemQuran0.videoDescription="إخفض صوت العالم قليلاً واستمع";
        videoItems.add(videoItemQuran0);

        VideoItem videoItemQuran2= new VideoItem();
        videoItemQuran2.videoURL="https://scontent.fcai19-4.fna.fbcdn.net/v/t50.33967-16/345867734_200058492380646_4206184797859105073_n.mp4?_nc_cat=108&ccb=1-7&_nc_sid=985c63&efg=eyJybHIiOjIxMjQsInJsYSI6MTAyNCwidmVuY29kZV90YWciOiJ4cHZfaGRfcHJvZ3Jlc3NpdmUifQ%3D%3D&_nc_ohc=QS_YSEutzRsAX8ytnqW&rl=2124&vabr=1416&_nc_ht=scontent.fcai19-4.fna&oh=00_AfAx9EbFFb0cne_JXOf3XFyeldwRvwKimFxUKfh_r4r-tg&oe=6466A949";
        videoItemQuran2.videoTitle="Quran2";
        videoItemQuran2.videoDescription=" Pyramides egypt ";
        videoItems.add(videoItemQuran2);


        VideoItem videoItemNature= new VideoItem();
        videoItemNature.videoURL="https://video.xx.fbcdn.net/v/t42.1790-2/282526335_770290277316166_837985096059306661_n.mp4?_nc_cat=100&ccb=1-7&_nc_sid=985c63&efg=eyJybHIiOjM3MCwicmxhIjo1MTIsInZlbmNvZGVfdGFnIjoic3ZlX3NkIn0%3D&_nc_ohc=0iGVUKMzuecAX9YEi7E&rl=370&vabr=206&_nc_ht=video-iad3-2.xx&oh=00_AfDAT6t1W7LwIUnb57eYDPmvxp0wm2ZwRXybN2Hzwfxn1w&oe=6466982A";
        videoItemNature.videoTitle=  "  قرأن ";
        videoItemNature.videoDescription="إخفض صوت العالم قليلاً واستمع .\uD83D\uDC99";
        videoItems.add(videoItemNature);


        VideoItem videoItemTravel= new VideoItem();
        videoItemTravel.videoURL="https://video.fcai19-4.fna.fbcdn.net/v/t42.1790-2/10000000_743640243900011_1616366793611876245_n.mp4?_nc_cat=105&ccb=1-7&_nc_sid=985c63&efg=eyJybHIiOjMwMCwicmxhIjoyNzAzLCJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_ohc=6a5lSEEJFeQAX-H-CnN&rl=300&vabr=100&_nc_ht=video.fcai19-4.fna&oh=00_AfDglDi-vAcmS076JyZyHC8SvqO40WRtOFDTeSbf1wvMtw&oe=6467A672";
        videoItemTravel.videoTitle="Travel";
        videoItemTravel.videoDescription="asddddddddddddddddddddddddddsdsad";
        videoItems.add(videoItemTravel);



        VideoItem videoItemTravel1= new VideoItem();
        videoItemTravel1.videoURL="https://video.xx.fbcdn.net/v/t42.1790-2/345912741_2266552840219749_2041816716194224186_n.mp4?_nc_cat=108&ccb=1-7&_nc_sid=985c63&efg=eyJybHIiOjQ2OSwicmxhIjo1MTIsInZlbmNvZGVfdGFnIjoic3ZlX3NkIn0%3D&_nc_ohc=njLgGuoVgqgAX-yVlOi&rl=469&vabr=261&_nc_ht=video-iad3-1.xx&oh=00_AfCPvVQF4DQyknwGCQ7mob1g_uvRzjGbb8VQ_d7g8xpIuA&oe=6467FBEE";
        videoItemTravel1.videoTitle="Travel";
        videoItemTravel1.videoDescription="asddddddddddddddddddddddddddsdsad";
        videoItems.add(videoItemTravel1);



        VideoItem videoItemTravel2= new VideoItem();
        videoItemTravel2.videoURL="https://video.fcai19-4.fna.fbcdn.net/v/t39.25447-2/333045862_571500454924934_1248566719683312267_n.mp4?_nc_cat=108&vs=6efa9f1ae062a9d4&_nc_vs=HBksFQAYJEdHYmcyUk9HMHByUnhnY0NBSXM2R2YzUXpGTVJibWRqQUFBRhUAAsgBABUAGCRHRnloMGhPZExPdG5rcTBBQUQ4SXNuV3FHNk5UYnJGcUFBQUYVAgLIAQBLB4gScHJvZ3Jlc3NpdmVfcmVjaXBlATENc3Vic2FtcGxlX2ZwcwAQdm1hZl9lbmFibGVfbnN1YgAgbWVhc3VyZV9vcmlnaW5hbF9yZXNvbHV0aW9uX3NzaW0AKGNvbXB1dGVfc3NpbV9vbmx5X2F0X29yaWdpbmFsX3Jlc29sdXRpb24AHXVzZV9sYW5jem9zX2Zvcl92cW1fdXBzY2FsaW5nABFkaXNhYmxlX3Bvc3RfcHZxcwAVACUAHIwXQAAAAAAAAAAREQAAACay9puZmpOVAxUCKANDM2UYC3Z0c19wcmV2aWV3HBdAQcQ5WBBiThgpZGFzaF9pNGxpdGViYXNpY181c2VjZ29wX2hxMl9mcmFnXzJfdmlkZW8SABgYdmlkZW9zLnZ0cy5jYWxsYmFjay5wcm9kOBJWSURFT19WSUVXX1JFUVVFU1QbCogVb2VtX3RhcmdldF9lbmNvZGVfdGFnBm9lcF9oZBNvZW1fcmVxdWVzdF90aW1lX21zATAMb2VtX2NmZ19ydWxlB3VubXV0ZWQTb2VtX3JvaV9yZWFjaF9jb3VudAQxNDg2EW9lbV9pc19leHBlcmltZW50AAxvZW1fdmlkZW9faWQPNjc0MzEyMzk0Mzg0NzE0Em9lbV92aWRlb19hc3NldF9pZA83Njg1OTYwNDgxOTk0NDgVb2VtX3ZpZGVvX3Jlc291cmNlX2lkDzg5MDkzNDM1MjExNzE0NRxvZW1fc291cmNlX3ZpZGVvX2VuY29kaW5nX2lkDzk3OTAyNTE0OTkyMzY2MQ52dHNfcmVxdWVzdF9pZAAlAhwAJcQBGweIAXMEOTA1MgJjZAoyMDIzLTAyLTI0A3JjYgQxNDAwA2FwcBnigI5GYWNlYm9vayBmb3IgaVBob25l4oCOAmN0DkZCX1NIT1JUU19QT1NUE29yaWdpbmFsX2R1cmF0aW9uX3MGMzUuNTczAnRzFXByb2dyZXNzaXZlX2VuY29kaW5ncwA%3D&ccb=1-7&_nc_sid=632d04&efg=eyJ2ZW5jb2RlX3RhZyI6Im9lcF9oZCJ9&_nc_ohc=W_pFJb_N1m0AX8-e4b_&_nc_ht=video.fcai19-4.fna&oh=00_AfDoqRa6OaZ5Pid06UbPth-2hbh-VMP3wTyMqrc8jXvXWQ&oe=64674059&_nc_rid=461311794919703";
        videoItemTravel2.videoTitle="Travel";
        videoItemTravel2.videoDescription="asddddddddddddddddddddddddddsdsad";
        videoItems.add(videoItemTravel2);

        VideoItem videoItemQuran= new VideoItem();
        videoItemQuran.videoURL="https://video.fcai19-4.fna.fbcdn.net/v/t39.25447-2/345629067_754033349794842_7342531719880748946_n.mp4?_nc_cat=106&vs=51276bc1fdad48ea&_nc_vs=HBksFQAYJEdJdmhtUlFhblBZUnlxMENBSkt2aDJPeTZlVmxibWRqQUFBRhUAAsgBABUAGCRHSEFZbmhSUTRpc1NldzhFQUJKYkZCSkh5ZjFSYnJGcUFBQUYVAgLIAQBLB4gScHJvZ3Jlc3NpdmVfcmVjaXBlATENc3Vic2FtcGxlX2ZwcwAQdm1hZl9lbmFibGVfbnN1YgAgbWVhc3VyZV9vcmlnaW5hbF9yZXNvbHV0aW9uX3NzaW0AKGNvbXB1dGVfc3NpbV9vbmx5X2F0X29yaWdpbmFsX3Jlc29sdXRpb24AHXVzZV9sYW5jem9zX2Zvcl92cW1fdXBzY2FsaW5nABFkaXNhYmxlX3Bvc3RfcHZxcwAVACUAHIwXQAAAAAAAAAAREQAAACb02u31vK%2FRAhUCKAJDMxgLdnRzX3ByZXZpZXccF0BIwAAAAAAAGCdkYXNoX3IyX2F2Y19nZW4xYXZjX2xjX3E5MF9mcmFnXzJfdmlkZW8SABgYdmlkZW9zLnZ0cy5jYWxsYmFjay5wcm9kOBJWSURFT19WSUVXX1JFUVVFU1QbCogVb2VtX3RhcmdldF9lbmNvZGVfdGFnBm9lcF9oZBNvZW1fcmVxdWVzdF90aW1lX21zATAMb2VtX2NmZ19ydWxlB3VubXV0ZWQTb2VtX3JvaV9yZWFjaF9jb3VudAU3MTEzOBFvZW1faXNfZXhwZXJpbWVudAAMb2VtX3ZpZGVvX2lkEDM1ODE3MTQ3MDIwNzMyNTISb2VtX3ZpZGVvX2Fzc2V0X2lkEDIwMjM2MTkxOTEzNjMxOTQVb2VtX3ZpZGVvX3Jlc291cmNlX2lkDzc0MTg4NjQ2NzYxODQ5MBxvZW1fc291cmNlX3ZpZGVvX2VuY29kaW5nX2lkEDMzNjIwOTQxMTA3MjQyNjkOdnRzX3JlcXVlc3RfaWQAJQIcACXEARsHiAFzAzU3MAJjZAoyMDIzLTA1LTEzA3JjYgU3MTEwMANhcHAa4oCORmFjZWJvb2sgZm9yIEFuZHJvaWTigI4CY3QORkJfU0hPUlRTX1BPU1QTb3JpZ2luYWxfZHVyYXRpb25fcwY0OS42NjcCdHMVcHJvZ3Jlc3NpdmVfZW5jb2RpbmdzAA%3D%3D&ccb=1-7&_nc_sid=edb1c8&efg=eyJ2ZW5jb2RlX3RhZyI6Im9lcF9oZCJ9&_nc_ohc=OPVW1wTKh_AAX-6ahYP&_nc_ht=video.fcai19-4.fna&oh=00_AfC821NPKdgPb-Dord1zg1OQsWmVVmLdLS_mbDgIvkADCw&oe=64666427&_nc_rid=425949331667900";
        videoItemQuran.videoTitle="Travel";
        videoItemQuran.videoDescription="asddddddddddddddddddddddddddsdsad";
        videoItems.add(videoItemQuran);



        VideoItem videoItemQuran3= new VideoItem();
        videoItemQuran3.videoURL="https://video.fcai19-4.fna.fbcdn.net/v/t39.25447-2/340821674_1245009359725474_4042695505856075471_n.mp4?_nc_cat=106&vs=4c94b68789960a11&_nc_vs=HBksFQAYJEdLcUdVQlNpNDZCVVZHd0VBTV9XbnJra2lobzRibWRqQUFBRhUAAsgBABUAGCRHSmJ1UVJRclhoWkRLaDBFQUpZNF9za0ZXVUJKYnJGcUFBQUYVAgLIAQBLB4gScHJvZ3Jlc3NpdmVfcmVjaXBlATENc3Vic2FtcGxlX2ZwcwAQdm1hZl9lbmFibGVfbnN1YgAgbWVhc3VyZV9vcmlnaW5hbF9yZXNvbHV0aW9uX3NzaW0AKGNvbXB1dGVfc3NpbV9vbmx5X2F0X29yaWdpbmFsX3Jlc29sdXRpb24AHXVzZV9sYW5jem9zX2Zvcl92cW1fdXBzY2FsaW5nABFkaXNhYmxlX3Bvc3RfcHZxcwAVACUAHIwXQAAAAAAAAAAREQAAACaK66Lg58P6ARUCKAJDMxgLdnRzX3ByZXZpZXccF0A0szMzMzMzGCdkYXNoX3IyX2F2Y19nZW4xYXZjX2xjX3E5MF9mcmFnXzJfdmlkZW8SABgYdmlkZW9zLnZ0cy5jYWxsYmFjay5wcm9kOBJWSURFT19WSUVXX1JFUVVFU1QbCogVb2VtX3RhcmdldF9lbmNvZGVfdGFnBm9lcF9oZBNvZW1fcmVxdWVzdF90aW1lX21zATAMb2VtX2NmZ19ydWxlB3VubXV0ZWQTb2VtX3JvaV9yZWFjaF9jb3VudAQ5NDMzEW9lbV9pc19leHBlcmltZW50AAxvZW1fdmlkZW9faWQPNTMyNDczODMyNDA4NTMxEm9lbV92aWRlb19hc3NldF9pZA8yNjM2NDk5NzkzNDg4NDgVb2VtX3ZpZGVvX3Jlc291cmNlX2lkDzU1MDkyMDc5MDQ5Nzk4ORxvZW1fc291cmNlX3ZpZGVvX2VuY29kaW5nX2lkEDEwMTc3OTUwNDU4NTYyMzYOdnRzX3JlcXVlc3RfaWQAJQIcACXEARsHiAFzBDY3NDECY2QKMjAyMy0wNC0xMQNyY2IEOTQwMANhcHAZ4oCORmFjZWJvb2sgZm9yIGlQaG9uZeKAjgJjdA5GQl9TSE9SVFNfUE9TVBNvcmlnaW5hbF9kdXJhdGlvbl9zBDIwLjcCdHMVcHJvZ3Jlc3NpdmVfZW5jb2RpbmdzAA%3D%3D&ccb=1-7&_nc_sid=632d04&efg=eyJ2ZW5jb2RlX3RhZyI6Im9lcF9oZCJ9&_nc_ohc=_XjykjMTnq4AX_HIvby&_nc_ht=video.fcai19-4.fna&oh=00_AfBjS1CFHbm7y8vZxguIF_LlpxD4JRl3Ko1HVxIA2ULmIQ&oe=646855CF&_nc_rid=549188920220993";
        videoItemQuran3.videoTitle="Travel";
        videoItemQuran3.videoDescription="asddddddddddddddddddddddddddsdsad";
        videoItems.add(videoItemQuran3);


        videosviewpager.setAdapter(new videosAdapter(videoItems));

    }


}