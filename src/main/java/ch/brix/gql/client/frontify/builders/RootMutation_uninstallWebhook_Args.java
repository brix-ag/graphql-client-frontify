package ch.brix.gql.client.frontify.builders;

public class RootMutation_uninstallWebhook_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `UninstallWebhook` input argument.
   * Default value: null
   */
  public RootMutation_uninstallWebhook_Args input(ch.brix.gql.client.frontify.input_objects.UninstallWebhookInput value) {
    _add_arg("input", value);
    return this;
  }
}
