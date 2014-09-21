package dlmbg.pckg.context.menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ContextMenuActivity extends Activity {
	  public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.main);
	 
	        ImageView tekan = (ImageView)findViewById(R.id.press);
	 
	        registerForContextMenu(tekan);
	    }
	 
	    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
	        super.onCreateContextMenu(menu, v, menuInfo);
	        MenuInflater inflater = getMenuInflater();
	        inflater.inflate(R.menu.con_menu, menu);
	    }
	 
	    public boolean onContextItemSelected(MenuItem item) {
	    	String isi = "Apakah ente pengguna ";
	        isi += item+"?";
	        tampil(isi);
	        return true;
	    }
	 
	    private void tampil(String isi) {
	        Toast.makeText(this, isi, Toast.LENGTH_LONG).show();
	    }
	 
}