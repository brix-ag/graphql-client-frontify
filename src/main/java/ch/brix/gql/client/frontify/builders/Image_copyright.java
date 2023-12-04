package ch.brix.gql.client.frontify.builders;

public class Image_copyright extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Copyright> {
  public Image_copyright() {
    super(new ch.brix.gql.client.Call<>("copyright", "Copyright"));
  }
  public Image_copyright onCopyright(On_Copyright typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
