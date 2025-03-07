package ch.brix.gql.client.frontify.builders;

public class RootMutation_uninstallWebhook extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UninstallWebhook> {
  public RootMutation_uninstallWebhook() {
    super(new ch.brix.gql.client.Call<>("uninstallWebhook", "UninstallWebhook"));
  }
  public RootMutation_uninstallWebhook args(RootMutation_uninstallWebhook_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_uninstallWebhook onUninstallWebhook(On_UninstallWebhook typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
