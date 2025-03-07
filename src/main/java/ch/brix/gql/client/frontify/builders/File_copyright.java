package ch.brix.gql.client.frontify.builders;

public class File_copyright extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Copyright> {
  public File_copyright() {
    super(new ch.brix.gql.client.Call<>("copyright", "Copyright"));
  }
  public File_copyright onCopyright(On_Copyright typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
