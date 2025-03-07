package ch.brix.gql.client.frontify.builders;

public class IconLibrary_collections extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CollectionItems> {
  public IconLibrary_collections() {
    super(new ch.brix.gql.client.Call<>("collections", "CollectionItems"));
  }
  public IconLibrary_collections args(IconLibrary_collections_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public IconLibrary_collections onCollectionItems(On_CollectionItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
