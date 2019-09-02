package adamatti;

import com.elepy.annotations.Identifier;
import com.elepy.annotations.Number;
import com.elepy.annotations.PrettyName;
import com.elepy.annotations.Required;
import com.elepy.annotations.RestModel;
import com.elepy.annotations.Text;
import com.elepy.annotations.Unique;
import com.elepy.models.TextType;

import java.math.BigDecimal;

@RestModel(name = "Products", slug = "/products")
public class Product {
    @Identifier
    private String productId;

    @Text(value = TextType.TEXTAREA, maximumLength = 100)
    private String shortDescription;

    @Text(TextType.HTML)
    private String htmlDescription;

    @PrettyName("Product Name")
    @Required
    @Unique
    private String name;

    @Number(minimum = 0f)
    private BigDecimal price;

    @Number(minimum = 0f)
    private Integer stockLeft;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getHtmlDescription() {
        return htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStockLeft() {
        return stockLeft;
    }

    public void setStockLeft(Integer stockLeft) {
        this.stockLeft = stockLeft;
    }


}
