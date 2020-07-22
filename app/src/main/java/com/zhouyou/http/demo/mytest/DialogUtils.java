package com.zhouyou.http.demo.mytest;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;


import com.zhouyou.http.demo.LoginActivity;
import com.zhouyou.http.demo.R;
import com.zhouyou.http.subsciber.IProgressDialog;

import java.util.List;

/**
 *
 */
public class DialogUtils {
    private static Dialog dialog;
    public static IProgressDialog loading(Context context, String content) {
       return show(context,content);
    }
    public static IProgressDialog loading(Context context) {
        return show(context,"加载中...");
    }


    private static IProgressDialog show(final Context context, final String content) {
     return new IProgressDialog() {
            @Override
            public Dialog getDialog() {
                LayoutInflater inflater = LayoutInflater.from(context);
                View view = inflater.inflate(R.layout.dialog_loading, null);
                if(dialog!=null&&dialog.isShowing()){
                    dialog.dismiss();
                }
                dialog = new Dialog(context, R.style.MyDialog);
                TextView msgText = (TextView) view.findViewById(R.id.tv_msg);
                if(TextUtils.isEmpty(content)){
                    msgText.setPadding(0,0,0,0);
                    msgText.setVisibility(View.GONE);
                }else {
                    msgText.setText(content);
                }
                dialog.setContentView(view);
                dialog.setCancelable(true);//返回键可以取消
                dialog.setCanceledOnTouchOutside(false);//界面外部不可取消
                return dialog;
            }
        };
    }
}
