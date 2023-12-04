package ch.brix.gql.client.frontify.builders;

public class Guideline_libraryPages extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibraryPageItems> {
  public Guideline_libraryPages() {
    super(new ch.brix.gql.client.Call<>("libraryPages", "LibraryPageItems"));
  }
  public Guideline_libraryPages args(Guideline_libraryPages_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Guideline_libraryPages onLibraryPageItems(On_LibraryPageItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
