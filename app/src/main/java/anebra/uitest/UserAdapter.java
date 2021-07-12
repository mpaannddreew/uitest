package anebra.uitest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static String TAG = UserAdapter.class.getSimpleName();

    private Context mContext;
    private List<User> users;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, email;
        LinearLayout user;

        public ViewHolder(View view) {
            super(view);
            name = (TextView) itemView.findViewById(R.id.name);
            email = (TextView) itemView.findViewById(R.id.email);
        }
    }


    public UserAdapter(Context mContext, List<User> users) {
        this.mContext = mContext;
        this.users = users;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;

        itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.user, parent, false);


        return new ViewHolder(itemView);
    }


    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        User u = users.get(position);
        ((ViewHolder) holder).name.setText(u.getName());
        if (u.getEmail() != null)
            ((ViewHolder) holder).email.setText(u.getEmail());
        else
            ((ViewHolder) holder).email.setVisibility(View.GONE);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
