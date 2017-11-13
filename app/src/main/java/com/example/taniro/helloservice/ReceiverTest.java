package com.example.taniro.helloservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ReceiverTest extends BroadcastReceiver {
    public ReceiverTest() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("Script", "onReceive()");
        //intent = new Intent("SERVICO_TEST");
        context.startService(new Intent(context, ServicoTest.class));
    }

}
