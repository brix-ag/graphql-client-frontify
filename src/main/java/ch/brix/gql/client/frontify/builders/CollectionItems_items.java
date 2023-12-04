package ch.brix.gql.client.frontify.builders;

public class CollectionItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.Collection>> {
  public CollectionItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "Collection"));
  }
  public CollectionItems_items onCollection(On_Collection typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
