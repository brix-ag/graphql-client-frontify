package ch.brix.gql.client.frontify.builders;

public class MediaLibrary_collections extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CollectionItems> {
  public MediaLibrary_collections() {
    super(new ch.brix.gql.client.Call<>("collections", "CollectionItems"));
  }
  public MediaLibrary_collections args(MediaLibrary_collections_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public MediaLibrary_collections onCollectionItems(On_CollectionItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
