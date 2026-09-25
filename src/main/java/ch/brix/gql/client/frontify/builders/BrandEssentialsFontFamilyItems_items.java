package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsFontFamilyItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.BrandEssentialsFontFamily>> {
  public BrandEssentialsFontFamilyItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "BrandEssentialsFontFamily"));
  }
  public BrandEssentialsFontFamilyItems_items onBrandEssentialsFontFamily(On_BrandEssentialsFontFamily typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
