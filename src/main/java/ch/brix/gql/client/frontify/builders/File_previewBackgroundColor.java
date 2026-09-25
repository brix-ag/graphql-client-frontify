package ch.brix.gql.client.frontify.builders;

public class File_previewBackgroundColor extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.RgbaColor> {
  public File_previewBackgroundColor() {
    super(new ch.brix.gql.client.Call<>("previewBackgroundColor", "RgbaColor"));
  }
  public File_previewBackgroundColor onRgbaColor(On_RgbaColor typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
