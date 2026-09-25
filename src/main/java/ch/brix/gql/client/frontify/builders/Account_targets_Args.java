package ch.brix.gql.client.frontify.builders;

public class Account_targets_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** How many `TargetItems` to show per query. Min: 1, Max: 100.
   * Default value: 25
   */
  public Account_targets_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * **BETA** Current page number.
   * Default value: 1
   */
  public Account_targets_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
}
