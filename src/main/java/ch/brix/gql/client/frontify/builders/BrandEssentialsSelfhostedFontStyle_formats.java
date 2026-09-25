package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsSelfhostedFontStyle_formats extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.BrandEssentialsSelfhostedFontStyleFormat>> {
  public BrandEssentialsSelfhostedFontStyle_formats() {
    super(new ch.brix.gql.client.Call<>("formats", "BrandEssentialsSelfhostedFontStyleFormat"));
  }
  public BrandEssentialsSelfhostedFontStyle_formats onBrandEssentialsSelfhostedFontStyleFormat(On_BrandEssentialsSelfhostedFontStyleFormat typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
