package chapter04;

public class Television {
    private int channel;

    public Television(int channel) {
        this.channel = 1;
        if(channel >= 1 && channel <= 14 ){
            this.channel = channel;
        }
    }

    //ゲッター(get)やセッター(set)を通じてのみ操作できるようにすることを「カプセル化(capsule)」と言います。
    // チャンネルの範囲チェックはまだ行っていない簡易版セッター
    public void setChannel(int channel){

        if(channel >= 1 && channel <= 14 ){
            this.channel = channel;
        }
    }

    //特定のインスタンス変数を読み取るためのメソッド」のことを「ゲッター」あるいは「ゲッターメソッド」と呼びます。
    public int getChannel(){
        return this.channel;
    }


    public void printStatus() {

        switch(this.channel){

            case 13:
                System.out.println("チャンネル：BS1 チャンネルが映っています。");
                break;

            case 14:
                System.out.println("チャンネル：BS2 チャンネルが映っています。");
                break;

            default:
                System.out.println("チャンネル：" + channel + "チャンネルが映っています。");
        }

    }
}