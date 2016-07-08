package drew.harker.mycardgame.view.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.ArrayList;
import java.util.List;

public class DialogBuilder
{
    private static FragmentManager manager;

    public static void buildSelection(UserInputRequest request)
    {
        DefaultDialog dialog = new DefaultDialog();
        dialog.setData(request);
        dialog.show(manager, "UserInputRequest");
    }

    /*public static void buildInfoDialog(List<Option> information)
    {
        DefaultDialog dialog = new DefaultDialog();
        dialog.setData(information);
        dialog.show(manager, "InformationDialog");
    }*/


    public static class DefaultDialog extends DialogFragment
    {
        private String title;
        private boolean hasCallback;
        private boolean isCancelable;
        private List<Option> options;
        private SelectionCallback callback;

        public void setData(UserInputRequest request)
        {
            hasCallback = true;
            isCancelable = request.isCancelable();
            this.options = request.getOptions();
            this.callback = request.getCallback();
            this.title = request.getTitle();
        }

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {

            LayoutInflater inflater = getActivity().getLayoutInflater();

            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

            //View playersView = inflater.inflate(R.layout.dialog, null);
            //builder.setView(playersView);
            //TODO: Build custom view

            if(hasCallback)
            {
                builder.setTitle(title);
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        List<Option> selections = new ArrayList<>();
                        //TODO:Get the list of options selected
                        callback.callback(options);//selections);
                    }
                });

                builder.setCancelable(isCancelable);
            }
            else
            {
                builder.setCancelable(true);
            }

            return builder.create();
        }
    }

}
