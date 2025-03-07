package ch.brix.gql.client.frontify.builders;

public class RootMutation_exportCreative extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.ExportCreative> {
  public RootMutation_exportCreative() {
    super(new ch.brix.gql.client.Call<>("exportCreative", "ExportCreative"));
  }
  public RootMutation_exportCreative args(RootMutation_exportCreative_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_exportCreative onExportCreative(On_ExportCreative typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
