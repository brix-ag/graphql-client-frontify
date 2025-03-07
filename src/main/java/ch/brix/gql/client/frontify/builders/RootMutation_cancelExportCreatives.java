package ch.brix.gql.client.frontify.builders;

public class RootMutation_cancelExportCreatives extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CancelExportCreatives> {
  public RootMutation_cancelExportCreatives() {
    super(new ch.brix.gql.client.Call<>("cancelExportCreatives", "CancelExportCreatives"));
  }
  public RootMutation_cancelExportCreatives args(RootMutation_cancelExportCreatives_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_cancelExportCreatives onCancelExportCreatives(On_CancelExportCreatives typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
