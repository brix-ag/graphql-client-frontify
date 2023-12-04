package ch.brix.gql.client.frontify.builders;

public class RemoveCollectionAssets_collection extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Collection> {
  public RemoveCollectionAssets_collection() {
    super(new ch.brix.gql.client.Call<>("collection", "Collection"));
  }
  public RemoveCollectionAssets_collection onCollection(On_Collection typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
