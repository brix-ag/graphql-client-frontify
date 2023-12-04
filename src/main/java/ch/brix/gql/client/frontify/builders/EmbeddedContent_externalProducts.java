package ch.brix.gql.client.frontify.builders;

public class EmbeddedContent_externalProducts extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.ExternalProduct>> {
  public EmbeddedContent_externalProducts() {
    super(new ch.brix.gql.client.Call<>("externalProducts", "ExternalProduct"));
  }
  public EmbeddedContent_externalProducts onExternalProduct(On_ExternalProduct typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
