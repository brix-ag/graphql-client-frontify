package ch.brix.gql.client.frontify.builders;

public class BrandEssentials_fontFamilies extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsFontFamilyItems> {
  public BrandEssentials_fontFamilies() {
    super(new ch.brix.gql.client.Call<>("fontFamilies", "BrandEssentialsFontFamilyItems"));
  }
  public BrandEssentials_fontFamilies args(BrandEssentials_fontFamilies_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public BrandEssentials_fontFamilies onBrandEssentialsFontFamilyItems(On_BrandEssentialsFontFamilyItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
