package ch.brix.gql.client.frontify.builders;

public class BrandEssentials_colorPalettes extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsColorPaletteItems> {
  public BrandEssentials_colorPalettes() {
    super(new ch.brix.gql.client.Call<>("colorPalettes", "BrandEssentialsColorPaletteItems"));
  }
  public BrandEssentials_colorPalettes args(BrandEssentials_colorPalettes_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public BrandEssentials_colorPalettes onBrandEssentialsColorPaletteItems(On_BrandEssentialsColorPaletteItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
