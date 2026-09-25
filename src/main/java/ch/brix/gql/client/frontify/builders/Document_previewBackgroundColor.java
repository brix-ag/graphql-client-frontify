package ch.brix.gql.client.frontify.builders;

public class Document_previewBackgroundColor extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.RgbaColor> {
  public Document_previewBackgroundColor() {
    super(new ch.brix.gql.client.Call<>("previewBackgroundColor", "RgbaColor"));
  }
  public Document_previewBackgroundColor onRgbaColor(On_RgbaColor typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
