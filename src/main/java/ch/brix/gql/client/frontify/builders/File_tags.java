package ch.brix.gql.client.frontify.builders;

public class File_tags extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.Tag>> {
  public File_tags() {
    super(new ch.brix.gql.client.Call<>("tags", "Tag"));
  }
  public File_tags onTag(On_Tag typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
