package ch.brix.gql.client.frontify.builders;

public class Brand_rgbaColor extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.RgbaColor> {
  public Brand_rgbaColor() {
    super(new ch.brix.gql.client.Call<>("rgbaColor", "RgbaColor"));
  }
  public Brand_rgbaColor onRgbaColor(On_RgbaColor typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
