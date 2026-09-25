package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorPalette_colors extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsColorItems> {
  public BrandEssentialsColorPalette_colors() {
    super(new ch.brix.gql.client.Call<>("colors", "BrandEssentialsColorItems"));
  }
  public BrandEssentialsColorPalette_colors args(BrandEssentialsColorPalette_colors_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public BrandEssentialsColorPalette_colors onBrandEssentialsColorItems(On_BrandEssentialsColorItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
