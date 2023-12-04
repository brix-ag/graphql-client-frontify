package ch.brix.gql.client.frontify.builders;

public class LogoLibrary_collections extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CollectionItems> {
  public LogoLibrary_collections() {
    super(new ch.brix.gql.client.Call<>("collections", "CollectionItems"));
  }
  public LogoLibrary_collections args(LogoLibrary_collections_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public LogoLibrary_collections onCollectionItems(On_CollectionItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
