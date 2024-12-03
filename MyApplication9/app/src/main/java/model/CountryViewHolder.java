package model;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class CountryViewHolder extends RecyclerView.ViewHolder
{
    private final TextView name;
    private final TextView capital;
    private final TextView flag;
    private final TextView currency;
    private Country country;
    //Constructeur, on récupère tous les éléments graphiques
    // définis dans country_layout.xml
    public CountryViewHolder(final View itemView)
    {
        super(itemView);
        name = ((TextView)itemView.findViewById(R.id.tvc_name));
        capital = ((TextView)itemView.findViewById(R.id.tvc_capital));
        flag = ((TextView)itemView.findViewById(R.id.tvc_flag));
        currency = ((TextView)itemView.findViewById(R.id.tvc_currency));
    }

    //Méthode permettant de mettre à jour la vue connaissant un Country
    public void afficher(Country country)
    {
        this.country = country;
        name.setText(country.getCommonName()+ " ("+country.getOfficialName()+ ")");
        capital.setText(country.getCapitalCity());
        flag.setText("NO FLAG"); // Pour le moment on a pas de drapeau
        currency.setText(country.getCurrencyName() + " ("+
                country.getCurrencyTrigram()+ ", " +
                country.getCurrencySymbol() + ")");
    }
}
