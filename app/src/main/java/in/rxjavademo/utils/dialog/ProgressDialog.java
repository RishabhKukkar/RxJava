package in.rxjavademo.utils.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;

import in.rxjavademo.R;

public class ProgressDialog extends Dialog {
    private TextView tvMessage;
    private String title, message;

    public ProgressDialog(@NonNull Context context) {
        super(context);
    }

    public ProgressDialog(@NonNull Context context, String title, String message) {
        super(context);
        this.title = title;
        this.message = message;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_progress);
        tvMessage = findViewById(R.id.d_progress_tv_message);
        if (title != null && message != null) {
            tvMessage.setText(message);
        }
    }
}