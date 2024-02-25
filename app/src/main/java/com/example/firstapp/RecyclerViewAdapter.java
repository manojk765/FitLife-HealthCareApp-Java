package com.example.firstapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecepieViewHolder>{
    private Context mContext;
    private List<Recepies> mData;

    public RecyclerViewAdapter(Context mContext, List<Recepies> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public RecepieViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int  viewType) {
        View view ;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        view = layoutInflater.inflate(R.layout.cardview_recepie,viewGroup,false);
        return  new RecepieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecepieViewHolder myHolder, int i) {
        myHolder.recipeTitle.setText(mData.get(i).getRecipeName());
        myHolder.img_recipe_thumbnail.setImageResource(mData.get(i).getThumbnail());

        final int position = i;

        myHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, RecepieDescription.class);

                intent.putExtra("RecipeName", mData.get(position).getRecipeName());
                intent.putExtra("RecipeIngredients", mData.get(position).getRecipeIngredients());
                intent.putExtra("RecipeMethodTitle", mData.get(position).getRecipeMethodTitle());
                intent.putExtra("Recipe", mData.get(position).getRecipe());
                intent.putExtra("Thumbnail", mData.get(position).getThumbnail());
                intent.putExtra("RecipeNutrientsHead",mData.get(position).getRecipeNutrientsHead());
                intent.putExtra("RecipeNutrients",mData.get(position).getRecipeNutrients());

                mContext.startActivity(intent);}
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class RecepieViewHolder extends RecyclerView.ViewHolder {

        TextView recipeTitle;
        CardView cardView;
        ImageView img_recipe_thumbnail;

        public RecepieViewHolder(@NonNull View itemView) {
            super(itemView);

            recipeTitle = (TextView)itemView.findViewById(R.id.recipe_text);
            img_recipe_thumbnail = (ImageView)itemView.findViewById(R.id.recipe_img_id);
            cardView = (CardView)itemView.findViewById(R.id.cardview_id);

        }
    }
}
