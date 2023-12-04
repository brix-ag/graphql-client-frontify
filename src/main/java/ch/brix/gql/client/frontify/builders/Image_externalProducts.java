package ch.brix.gql.client.frontify.builders;

public class Image_externalProducts extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.ExternalProduct>> {
  public Image_externalProducts() {
    super(new ch.brix.gql.client.Call<>("externalProducts", "ExternalProduct"));
  }
  public Image_externalProducts onExternalProduct(On_ExternalProduct typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
