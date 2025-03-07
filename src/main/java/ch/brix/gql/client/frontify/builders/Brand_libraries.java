package ch.brix.gql.client.frontify.builders;

public class Brand_libraries extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibraryItems> {
  public Brand_libraries() {
    super(new ch.brix.gql.client.Call<>("libraries", "LibraryItems"));
  }
  public Brand_libraries args(Brand_libraries_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Brand_libraries onLibraryItems(On_LibraryItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
