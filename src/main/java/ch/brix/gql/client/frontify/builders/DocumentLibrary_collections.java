package ch.brix.gql.client.frontify.builders;

public class DocumentLibrary_collections extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CollectionItems> {
  public DocumentLibrary_collections() {
    super(new ch.brix.gql.client.Call<>("collections", "CollectionItems"));
  }
  public DocumentLibrary_collections args(DocumentLibrary_collections_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public DocumentLibrary_collections onCollectionItems(On_CollectionItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
