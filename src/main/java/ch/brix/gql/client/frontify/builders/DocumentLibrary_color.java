package ch.brix.gql.client.frontify.builders;

public class DocumentLibrary_color extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.RgbaColor> {
  public DocumentLibrary_color() {
    super(new ch.brix.gql.client.Call<>("color", "RgbaColor"));
  }
  public DocumentLibrary_color onRgbaColor(On_RgbaColor typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
