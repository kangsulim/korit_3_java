package ch18_generic.products;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product<T> {
    private String productName;
    private T productInfo;
}
