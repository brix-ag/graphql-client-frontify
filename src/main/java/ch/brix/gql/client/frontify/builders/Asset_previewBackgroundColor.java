package ch.brix.gql.client.frontify.builders;

public class Asset_previewBackgroundColor extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.RgbaColor> {
  public Asset_previewBackgroundColor() {
    super(new ch.brix.gql.client.Call<>("previewBackgroundColor", "RgbaColor"));
  }
  public Asset_previewBackgroundColor onRgbaColor(On_RgbaColor typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
