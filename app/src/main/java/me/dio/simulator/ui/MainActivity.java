package me.dio.simulator.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import me.dio.simulator.databinding.ActivityMainBinding;
import me.dio.simulator.domain.Team;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Team time = new Team("Teste", 5, "");
        //time.getImage();

        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();
    }

    private void setupFloatingActionButton() {
        //TODO criar elemento de click e simulação de partidas
    }

    private void setupMatchesRefresh() {
        //TODO Atualizar as partidas na ação de swipe
    }

    private void setupMatchesList() {
        //TODO Listar as partidas, consumindo nossa API
    }
}
