package ch.brix.gql.client.frontify.builders;

public class IconLibrary_color extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.RgbaColor> {
  public IconLibrary_color() {
    super(new ch.brix.gql.client.Call<>("color", "RgbaColor"));
  }
  public IconLibrary_color onRgbaColor(On_RgbaColor typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
