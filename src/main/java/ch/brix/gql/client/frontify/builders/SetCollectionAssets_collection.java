package ch.brix.gql.client.frontify.builders;

public class SetCollectionAssets_collection extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Collection> {
  public SetCollectionAssets_collection() {
    super(new ch.brix.gql.client.Call<>("collection", "Collection"));
  }
  public SetCollectionAssets_collection onCollection(On_Collection typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
