package ch.brix.gql.client.frontify.builders;

public class Library_collections extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CollectionItems> {
  public Library_collections() {
    super(new ch.brix.gql.client.Call<>("collections", "CollectionItems"));
  }
  public Library_collections args(Library_collections_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Library_collections onCollectionItems(On_CollectionItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
