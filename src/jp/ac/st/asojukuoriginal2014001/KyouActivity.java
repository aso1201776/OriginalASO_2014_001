package jp.ac.st.asojukuoriginal2014001;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class KyouActivity extends MainActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kyou_activity);

		// 渡ってきたintentを取得
		Intent intent = getIntent();
		// intentに混入していたEtraから、キーワードをもとに値を取得
		String name = intent.getStringExtra("name");

		TextView tv = (TextView)findViewById(R.id.txvMsg);
		tv.setText(name + "さんの今日の運勢は・・・");
	}

}
