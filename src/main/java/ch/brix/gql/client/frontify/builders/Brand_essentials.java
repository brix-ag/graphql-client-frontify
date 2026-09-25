package ch.brix.gql.client.frontify.builders;

public class Brand_essentials extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentials> {
  public Brand_essentials() {
    super(new ch.brix.gql.client.Call<>("essentials", "BrandEssentials"));
  }
  public Brand_essentials onBrandEssentials(On_BrandEssentials typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
