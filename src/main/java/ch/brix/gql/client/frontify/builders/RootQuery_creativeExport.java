package ch.brix.gql.client.frontify.builders;

public class RootQuery_creativeExport extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreativeExport> {
  public RootQuery_creativeExport() {
    super(new ch.brix.gql.client.Call<>("creativeExport", "CreativeExport"));
  }
  public RootQuery_creativeExport args(RootQuery_creativeExport_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootQuery_creativeExport onCreativeExport(On_CreativeExport typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
