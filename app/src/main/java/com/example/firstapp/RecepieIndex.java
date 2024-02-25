package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecepieIndex extends AppCompatActivity {
    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;
    List<Recepies> recipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recepies);

        recipes = new ArrayList<>();

        recipes.add(new Recepies("Grilled Lemon Herb Chicken with Quinoa Salad",
                "2 boneless, skinless chicken breasts\n" +
                        "2 tablespoons olive oil\n" +
                        "1 tablespoon chopped fresh parsley\n" +
                        "1 teaspoon dried oregano\n" +
                        "1 teaspoon dried thyme\n" +
                        "Salt and pepper to taste\n" +
                        "1 cup cooked quinoa\n" +
                        "1 cup cherry tomatoes, halved\n" +
                        "1 cucumber, diced\n" +
                        "1/4 cup feta cheese, crumbled\n" +
                        "1/4 cup Kalamata olives, sliced\n" +
                        "Juice of 1 lemon\n" +
                        "2 tablespoons balsamic vinegar",
                "Method",
                "Grilled Lemon Herb Chicken with Quinoa Salad is a refreshing and healthy dish perfect for a light lunch or dinner. Marinate chicken breasts with olive oil, parsley, oregano, thyme, salt, and pepper. Grill until cooked through. In a bowl, mix cooked quinoa, cherry tomatoes, cucumber, feta cheese, and Kalamata olives. Slice the grilled chicken and place it on top of the quinoa salad. Drizzle with a mixture of lemon juice and balsamic vinegar. Toss everything together and serve.",
                R.drawable.quinoa, "Calories: 350, Protein: 25g, Carbs: 30g, Fat: 15g"));

        recipes.add(new Recepies("Vegetarian Stir-Fry with Tofu",
                "1 block extra-firm tofu, pressed and cubed\n" +
                        "2 tablespoons soy sauce\n" +
                        "1 tablespoon sesame oil\n" +
                        "1 tablespoon vegetable oil\n" +
                        "1 bell pepper, sliced\n" +
                        "1 broccoli crown, cut into florets\n" +
                        "1 carrot, julienned\n" +
                        "1 cup snap peas\n" +
                        "3 cloves garlic, minced\n" +
                        "1 tablespoon ginger, grated\n" +
                        "2 tablespoons hoisin sauce\n" +
                        "1 tablespoon rice vinegar\n" +
                        "2 green onions, sliced",
                "Method",
                "Vegetarian Stir-Fry with Tofu is a quick and delicious dish loaded with colorful vegetables and tofu. Marinate tofu cubes in soy sauce and sesame oil. In a wok or skillet, heat vegetable oil and stir-fry tofu until golden. Add bell pepper, broccoli, carrot, snap peas, garlic, and ginger. Cook until vegetables are tender-crisp. Stir in hoisin sauce and rice vinegar. Garnish with sliced green onions and serve over rice or noodles.",
                R.drawable.tofu, "Calories: 280, Protein: 18g, Carbs: 20g, Fat: 15g"));

        recipes.add(new Recepies("Salmon and Quinoa Stuffed Peppers",
                "2 salmon fillets, cooked and flaked\n" +
                        "1 cup cooked quinoa\n" +
                        "4 bell peppers, halved and seeds removed\n" +
                        "1 cup cherry tomatoes, halved\n" +
                        "1/2 cup feta cheese, crumbled\n" +
                        "1/4 cup fresh parsley, chopped\n" +
                        "2 tablespoons olive oil\n" +
                        "Salt and pepper to taste",
                "Method",
                "Salmon and Quinoa Stuffed Peppers make a nutritious and flavorful meal. In a bowl, mix flaked salmon, cooked quinoa, cherry tomatoes, feta cheese, and fresh parsley. Drizzle with olive oil, and season with salt and pepper. Stuff the halved bell peppers with the salmon-quinoa mixture. Bake in the oven until peppers are tender. Serve warm and enjoy.",
                R.drawable.peppers, "Calories: 320, Protein: 22g, Carbs: 25g, Fat: 15g"));

        recipes.add(new Recepies("Mango and Avocado Salad with Grilled Shrimp",
                "1 pound large shrimp, peeled and deveined\n" +
                        "2 tablespoons olive oil\n" +
                        "1 teaspoon chili powder\n" +
                        "Salt and pepper to taste\n" +
                        "2 ripe mangoes, peeled and diced\n" +
                        "2 avocados, peeled and sliced\n" +
                        "1/2 red onion, thinly sliced\n" +
                        "1/4 cup fresh cilantro, chopped\n" +
                        "Juice of 2 limes\n" +
                        "1 tablespoon honey",
                "Method",
                "Mango and Avocado Salad with Grilled Shrimp is a vibrant and flavorful dish. Toss shrimp with olive oil, chili powder, salt, and pepper. Grill until cooked through. In a large bowl, combine diced mangoes, sliced avocados, red onion, and chopped cilantro. Add grilled shrimp. In a small bowl, whisk together lime juice and honey. Drizzle over the salad and toss gently to combine. Serve immediately.",
                R.drawable.prawnmango, "Calories: 280, Protein: 20g, Carbs: 30g, Fat: 12g"));

        recipes.add(new Recepies("Quinoa and Black Bean Stuffed Sweet Potatoes",
                "4 medium-sized sweet potatoes\n" +
                        "1 cup cooked quinoa\n" +
                        "1 can black beans, drained and rinsed\n" +
                        "1 cup corn kernels\n" +
                        "1/2 red onion, finely chopped\n" +
                        "1/4 cup fresh cilantro, chopped\n" +
                        "1 teaspoon ground cumin\n" +
                        "1 teaspoon chili powder\n" +
                        "Salt and pepper to taste\n" +
                        "Juice of 1 lime\n" +
                        "1/4 cup Greek yogurt (optional)",
                "Method",
                "Quinoa and Black Bean Stuffed Sweet Potatoes are a nutritious and satisfying meal. Bake sweet potatoes until tender. In a bowl, mix cooked quinoa, black beans, corn, red onion, cilantro, cumin, chili powder, salt, and pepper. Cut a slit in each sweet potato and fluff the flesh with a fork. Spoon the quinoa mixture into the sweet potatoes. Squeeze lime juice over the top. Optionally, serve with a dollop of Greek yogurt. Enjoy!",
                R.drawable.blackbean, "Calories: 300, Protein: 15g, Carbs: 40g, Fat: 8g"));

        recipes.add(new Recepies("Vegan Lentil and Vegetable Curry",
                "1 cup dry lentils, cooked\n" +
                        "1 eggplant, diced\n" +
                        "1 bell pepper, chopped\n" +
                        "1 can coconut milk\n" +
                        "1 onion, finely chopped\n" +
                        "2 cloves garlic, minced\n" +
                        "2 tablespoons curry powder\n" +
                        "1 teaspoon ground turmeric\n" +
                        "Salt and pepper to taste\n" +
                        "Fresh cilantro for garnish",
                "Method",
                "Sauté onion and garlic until soft. Add eggplant, bell pepper, curry powder, turmeric, salt, and pepper. Cook until vegetables are tender. Stir in cooked lentils and coconut milk. Simmer until flavors meld. Garnish with fresh cilantro before serving.",
                R.drawable.vegancurry, "Calories: 320, Protein: 18g, Carbs: 35g, Fat: 12g"));

        recipes.add(new Recepies("Mediterranean Chicken and Quinoa Bowl",
                "1 cup cooked quinoa\n" +
                        "1 grilled chicken breast, sliced\n" +
                        "1 cup cherry tomatoes, halved\n" +
                        "1/2 cup cucumber, diced\n" +
                        "1/4 cup Kalamata olives, sliced\n" +
                        "1/4 cup feta cheese, crumbled\n" +
                        "2 tablespoons olive oil\n" +
                        "1 teaspoon dried oregano\n" +
                        "Salt and pepper to taste",
                "Method",
                "Arrange quinoa in bowls. Top with sliced grilled chicken, cherry tomatoes, cucumber, olives, and feta. Drizzle with olive oil, sprinkle oregano, salt, and pepper.",
                R.drawable.chickenquinoa, "Calories: 380, Protein: 28g, Carbs: 30g, Fat: 18g"));

        recipes.add(new Recepies("Grilled Salmon with Asparagus and Lemon Quinoa",
                "4 salmon fillets\n" +
                        "1 bunch asparagus, trimmed\n" +
                        "1 cup cooked quinoa\n" +
                        "1 lemon, sliced\n" +
                        "2 cloves garlic, minced\n" +
                        "2 tablespoons olive oil\n" +
                        "Salt and pepper to taste",
                "Method",
                "Grill salmon and asparagus until cooked. In a bowl, mix quinoa, minced garlic, olive oil, salt, and pepper. Serve grilled salmon and asparagus over quinoa. Garnish with lemon slices.",
                R.drawable.salmon, "Calories: 400, Protein: 30g, Carbs: 25g, Fat: 20g"));

        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);

    }
}