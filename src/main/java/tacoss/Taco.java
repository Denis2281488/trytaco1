package tacoss;

import java.util.List;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor

public class Taco {



    private String name;
    private List<String> ingredients;
}